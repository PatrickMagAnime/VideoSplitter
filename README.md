# VideoSplitter
```markdown
# **YEET YOUR VIDEO INTO CHUNKS (The Nya-nya Splitter)** 🎬🐾

Alright, buckle up buttercup. This bad boy right here is gonna take your chunky, dummy-thicc videos and slice ‘em into juicy, snackable pieces. No fluff, no jizz—just pure, unhinged video-chopping action. Let’s get this bread. 😤

---

## **What Does This Thing Even Do?**
- You drop a single, lonely video (yes, just ONE, no funny business) into the `Eingabe` folder.  
- Program asks you some no-brainer stuff like:  
  - “How long do you want each piece to be? (default’s 59 seconds, ya lazy bum)”  
  - “You wanna mess with the codec, bro? Copy it or nah?”  
  - “Frames per second? Touch it or leave it alone like a feral cat?”  
- THEN it chops your vid into sweet little chunks and spits ‘em into the `Ausgabe` folder.  
- File names come out all bougie, like `MyVideo_Part1_ofX.mp4`. You're welcome.

---

## **How to Install This Slice Machine™**
First off, you need to set up your rig. Don’t skip this part, or I swear the program will YEET an error at you so hard you’ll cry.  

### **1. Java - The OG Runtime™**  
Download Java, my dude. Grab it here:  
[Java Download](https://www.oracle.com/java/technologies/javase-downloads.html)  
Test if it’s vibin’ with:  
```bash
java --version
```  

### **2. FFmpeg - The Wizard of Video Choppin’**  
- Go to [FFmpeg Download](https://ffmpeg.org/download.html), download the essentials, and unzip that bad boy.  
- Throw it somewhere safe (C:\ffmpeg or some shiz like that).  
- Add its `bin` folder to your PATH. Don’t know how? Google it, ya dingus. Here's some cheat links:  
  - [Set PATH on Windows](https://www.architectryan.com/2018/03/17/add-to-the-path-on-windows-10/)  
  - [Set PATH on Linux/Mac](https://opensource.com/article/17/6/set-path-linux)  

Type `ffmpeg -version` in your terminal to confirm it’s alive. No errors? Congrats, you’re halfway to godhood.  

### **3. Clone This Glorious Code**  
Pull this repo from the matrix with:  
```bash
git clone <your-repo-url>
```  

### **4. Run It Like You Own It**  
- Open this thing in VS Code, IntelliJ, or whatever nerd tool you use.  
- Compile and run `VideoSplitter.java` (it’s the one doing the heavy lifting).  

---

## **How to Use This Chaos-Machine**  
Once it’s up and running, follow these steps. It’s idiot-proof. Probably.

1. **Toss your video into `Eingabe`**  
   - ONE VIDEO ONLY. If you try to sneak in more, the program’s gonna flip a table and bail.  

2. **Answer some simple Q’s (Don’t overthink it)**  
   - **Duration?** Default’s 59 seconds. Wanna change it? Go nuts.  
   - **Codec?** Type `copy` to keep the OG quality or flex with a different codec.  
   - **FPS?** Default is `-1` (aka don’t touch it). Wanna change it? Sure, but don’t blame me if it janks.  

3. **Ready, Freddy?**  
   - The program will ask: “Ready to process this bad boy? (yes/no)”  
   - Type `yes`: LET THE YEETING BEGIN.  
   - Type `no`: It'll chill, reset, and give you time to rethink your life choices.  

4. **Results?**  
   - Go peep the `Ausgabe` folder. Your chopped-up videos will be lounging there, lookin’ cute.  
   - File names? Something like `MyVideo_Part1_ofX.mp4`. Clean and classy, just like you.  

5. **Wanna go again?**  
   - The program loops back and asks, “Wanna slice another one, bro? (yes/no)”  
   - Type `yes`: Rinse and repeat, baby.  
   - Type `no`: Alright, peace out.  

---

## **Troubleshooting (a.k.a. Why Is This Thing Jank?)**  
- **"FFmpeg not found":** Bro, double-check it’s in your PATH. I explained this already.  
- **"No video in Eingabe":** Uh, maybe put a video in there, genius?  
- **"Error splitting video":** Copy the error, paste it into Google, and hope for the best.  

---

## **What’s Inside This Beast?**  
- **Language:** Java (because why not?)  
- **Video Magic:** FFmpeg, the absolute GOAT of media processing.  
- **Features:**  
  - Keeps your original video untouched (no janky overwrites here).  
  - Fancy segment naming (you’ll feel like royalty).  
  - Handles weird runtimes (no 4-second leftovers—ain’t nobody got time for that).  

---

### **Stuff To Do Later (aka Wishlist of Dreams)**  
- Add support for multiple videos.  
- GUI interface for those who fear the terminal.  
- Auto-detect codec, FPS, and other nerd stuff.  

---

## **Shoutouts & Sources**  
- FFmpeg Docs (straight-up lifesaver): [FFmpeg Docs](https://ffmpeg.org/documentation.html)  
- StackOverflow (the place we all Google answers from): [stackoverflow.com](https://stackoverflow.com)  
- My dumb brain for writing this while sleep-deprived.  

---

## **Closing Words of Wisdom**  
This program’s like a blender for your vids. Use it wisely, or just go nuts. But don’t blame me if your cat walks on your keyboard and deletes your files. Nya~ 🐾  

---

Now go slice some vids like a true god-tier. PEACE OUT. ✌️  
