import java.io.*;


/*
 * EXPLANATION IN VideoSplitter.java
 */
public class VideoSplitterUtils {
    public static void splitVideo(File video, File ausgabeOrdner, int segmentDauer, String codec, int fps) throws IOException {
        // Videodauer ermitteln
        int videoDauer = getVideoDauer(video.getAbsolutePath());
        System.out.println("Gesamtdauer des Videos: " + videoDauer + " Sekunden");

        // Berechnung der Anzahl der Segmente
        int anzahlSegmente = (int) Math.ceil((double) videoDauer / segmentDauer);
        System.out.println("Das Video wird in " + anzahlSegmente + " Segmente unterteilt.");

        // Videos schneiden
        for (int i = 0; i < anzahlSegmente; i++) {
            int startZeit = i * segmentDauer;
            int segmentLaenge = segmentDauer;

            // Letztes Segment anpassen
            if (i == anzahlSegmente - 1 && videoDauer - startZeit < segmentDauer) {
                segmentLaenge = segmentDauer; // Wiederholung eines Teils des vorigen Segments
                startZeit = Math.max(0, videoDauer - segmentDauer); // Überschneiden für sinnvolle Länge
            }

            String ausgabeDatei = String.format("%s\\%s_part%d_of_%d.mp4",
                    ausgabeOrdner.getAbsolutePath(),
                    video.getName().replaceFirst("\\.[a-zA-Z0-9]+$", ""),
                    i + 1,
                    anzahlSegmente);

            ProcessBuilder processBuilder;
            if (fps > 0) {
                // Mit angegebener FPS
                processBuilder = new ProcessBuilder(
                        "ffmpeg",
                        "-i", video.getAbsolutePath(),
                        "-ss", String.valueOf(startZeit),
                        "-t", String.valueOf(segmentLaenge),
                        "-r", String.valueOf(fps),
                        "-c", codec,
                        ausgabeDatei
                );
            } else {
                // Standard-FPS beibehalten
                processBuilder = new ProcessBuilder(
                        "ffmpeg",
                        "-i", video.getAbsolutePath(),
                        "-ss", String.valueOf(startZeit),
                        "-t", String.valueOf(segmentLaenge),
                        "-c", codec,
                        ausgabeDatei
                );
            }

            processBuilder.inheritIO();
            Process process = processBuilder.start();
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("Prozess unterbrochen", e);
            }

            System.out.println("Erstellt: " + ausgabeDatei);
        }
    }

    public static int getVideoDauer(String videoPfad) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "ffprobe",
                "-i", videoPfad,
                "-show_entries", "format=duration",
                "-v", "quiet",
                "-of", "csv=p=0"
        );
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    return (int) Math.ceil(Double.parseDouble(line)); // Dauer in Sekunden
                } catch (NumberFormatException e) {
                    System.err.println("Fehler beim Parsen der ffprobe-Ausgabe: " + line);
                }
            }
        }
        throw new IOException("Videodauer konnte nicht ermittelt werden.");
    }
}
