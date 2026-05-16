# Daily Quotes App - Cloud Build Guide

Since this project requires the Android SDK to build, and you want to avoid installing heavy software like Android Studio, we are using **GitHub Actions** to build the APK for you.

## Instructions to get your APK:

1.  **Create a Repository:**
    - Go to [GitHub](https://github.com/new) and create a new repository (e.g., `Daily-Quotes`).
    
2.  **Upload the Files:**
    - Upload all the files from this folder to your new GitHub repository.
    
3.  **Wait for the Build:**
    - Once you upload the files, GitHub will automatically start building the APK.
    - Go to the **"Actions"** tab at the top of your GitHub repository.
    - Click on the **"Build APK"** workflow.
    
4.  **Download your APK:**
    - After 3-5 minutes, the build will finish (it will turn green).
    - Scroll down to the **"Artifacts"** section at the bottom of the page.
    - Click on **"DailyQuotes-Debug-APK"** to download it.
    - Unzip the downloaded file to find your `app-debug.apk`.

5.  **Install on Emulator:**
    - Drag and drop the `app-debug.apk` file into your Android emulator!
