# Adaptive UI Using ListView and ImageView - Android Studio Project

An Android application developed using Kotlin in Android Studio to demonstrate an adaptive user interface using `ListView` and `ImageView`.

## 📱 Screenshot

![Adaptive UI Screenshot](screenshot.png)

## ✨ Features

* **Language:** Kotlin
* **UI Framework:** Android XML with `ListView` and `ImageView`
* **Minimum SDK:** Android 8.0 (API Level 26)
* **Target SDK:** Android 14 / API Level 34+
* **Architecture:** Standard Android App Structure
* **UI:** Scrollable ListView with images and text
* **Scenario:** College Student Resource List

## 🎯 Experiment Objective

The objective of this experiment is to create an adaptive Android user interface using `ListView` and `ImageView`.

The application displays a list of college resources such as:

* 📚 Books
* 📝 Notes
* 🔬 Laboratory Resources
* 📋 Assignments
* 💻 Projects

Each list item contains an image, title, and description.

## 🧠 Concept / Technology

### ListView

`ListView` is an Android UI component used to display a vertically scrollable list of items.

### ImageView

`ImageView` is used to display images for each item in the ListView.

### Adaptive UI

The application is designed so that the list can be viewed and scrolled on different screen sizes and orientations.

## 👩‍🎓 Student Details

* **Name:** Swarupa S
* **USN:** 25MCAR0137
* **Course:** MCA

## 📁 Project Structure

```text
AdaptiveListViewApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/adaptivelistviewapp/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── drawable/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── list_item.xml
│   │   │   │   └── values/
│   │   │   │       ├── colors.xml
│   │   │   │       ├── strings.xml
│   │   │   │       └── themes.xml
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 📂 Important Files

* **MainActivity.kt** – Contains the Kotlin code for displaying the ListView.
* **activity_main.xml** – Contains the main application layout.
* **list_item.xml** – Defines the layout of each ListView item.
* **drawable/** – Contains the images used in the application.
* **AndroidManifest.xml** – Contains application and activity configuration.

## 🚀 Getting Started

### Prerequisites

* [Android Studio](https://developer.android.com/studio) (latest version recommended)
* JDK 17 or higher
* Android SDK (API 34+)

### Building and Running

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/swarupa-2003/AdaptiveListViewApp.git
   ```

2. **Open in Android Studio:**

   * Open Android Studio.
   * Select **Open an Existing Project**.
   * Select the cloned project directory.

3. **Sync Gradle:**

   * Allow Android Studio to sync the Gradle dependencies automatically.

4. **Run the Application:**

   * Connect an Android device or launch an Emulator.
   * Click **Run** (`Shift + F10`) to build and run the application.

## 🧪 Test Cases

### Test Case 1 - ListView Display

**Test:** Verify that the list of resources is displayed.

**Expected Result:** All resource items should be displayed in a vertically scrollable ListView.

**Status:** ✅ PASS

![Test Case 1](testcase1.png)

---

### Test Case 2 - ImageView Display

**Test:** Verify that each resource displays its corresponding image.

**Expected Result:** Images should be displayed correctly along with the resource name and description.

**Status:** ✅ PASS

![Test Case 2](testcase2.png)

---

### Test Case 3 - Student Details

**Test:** Verify that the student's name and USN are displayed correctly.

**Expected Result:** The application should clearly display:

```text
Name: Swarupa S
USN: 25MCAR0137
```



## 📸 Screenshots

Add the following screenshots to the GitHub repository:
<img width="1812" height="632" alt="image" src="https://github.com/user-attachments/assets/e50c4951-5800-41f9-9622-5e3f13500c7a" />



Make sure `testcase3.png` clearly shows your **name and USN**, as required by the experiment.

## 📋 Test Case Summary

| Test Case | Description              | Status |
| --------- | ------------------------ | ------ |
| TC01      | Verify ListView display  | ✅ PASS |
| TC02      | Verify ImageView display | ✅ PASS |
| TC03      | Verify Name and USN      | ✅ PASS |

## 🎓 Learning Outcomes

Through this experiment, I learned:

* How to create and use a `ListView`.
* How to use `ImageView` in Android XML.
* How to create custom ListView items.
* How to connect Kotlin code with XML layouts.
* How to create a scrollable user interface.
* How to design an adaptive Android UI.
* How to test an Android application.
* How to upload an Android project to GitHub.

## ✅ Conclusion

The **Adaptive UI Using ListView and ImageView** application was successfully developed using Kotlin and Android XML. The application demonstrates the use of ListView for displaying multiple items and ImageView for displaying images within each item.

The application was tested using three test cases, including a test case that displays the student's name and USN.

---

Developed by **Swarupa S**

**USN:** 25MCAR0137
