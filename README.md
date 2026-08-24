Name: Maitri Patel
En.no: 25172012060
Class: IOT-CE-I

# Practical 2 – Android Activity Life Cycle and Basic UI

## Aim

To create an Android application demonstrating the **Activity Life Cycle** and **Basic User Interface (UI)** using Kotlin.

---

## Objective

The application demonstrates:

* Creating an Android Activity using Kotlin.
* Displaying **"Hello World"** using a `TextView`.
* Designing the UI using XML.
* Applying background and text formatting properties.
* Understanding the different stages of the Android Activity Life Cycle.
* Displaying life cycle events using **Logcat**.
* Using **Toast** messages.
* Using **Snackbar** messages.

---

## Technologies Used

* **Language:** Kotlin
* **UI:** XML
* **IDE:** Android Studio
* **Platform:** Android

---

## Basic UI

The application contains a `TextView` centered on the Activity screen.

### TextView Properties

| Property   | Value              |
| ---------- | ------------------ |
| Text       | `Hello World`      |
| Background | Yellow (`#FFFF00`) |
| Text Color | Holo Blue Bright   |
| Text Size  | `27sp`             |
| Text Style | Bold + Italic      |
| Position   | Center of Activity |

The Activity layout uses a yellow background, while the `TextView` displays **Hello World** in bold and italic Holo Blue text.

---

## Activity Life Cycle

The application demonstrates the following Activity life cycle methods:

1. `onCreate()`
2. `onStart()`
3. `onResume()`
4. `onPause()`
5. `onStop()`
6. `onRestart()`
7. `onDestroy()`

Each method prints a message in **Logcat** whenever the corresponding life cycle event occurs.

### Life Cycle Flow

```text
onCreate()
    ↓
onStart()
    ↓
onResume()
    ↓
Activity Running
    ↓
onPause()
    ↓
onStop()
    ↓
onRestart()
    ↓
onStart()
    ↓
onResume()
```

When the Activity is permanently closed, `onDestroy()` is called.

---

## Logcat

Log messages are used to observe the execution of Activity Life Cycle methods.

Example:

```text
onCreate() called
onStart() called
onResume() called
onPause() called
onStop() called
onRestart() called
onDestroy() called
```

The messages can be viewed in **Android Studio Logcat** while running the application.

---

## Toast and Snackbar

The application also demonstrates user notifications using:

* **Toast** – Displays a short message to the user.
* **Snackbar** – Displays a temporary message at the bottom of the screen.

These messages are triggered during Activity life cycle events to demonstrate their usage.

---

## Concepts Covered

* Android Activity
* Activity Life Cycle
* `onCreate()`
* `onStart()`
* `onResume()`
* `onPause()`
* `onStop()`
* `onRestart()`
* `onDestroy()`
* XML Layout
* `TextView`
* Text Styling
* Background Color
* Logcat
* Toast
* Snackbar
* Kotlin

---

## Expected Output

The application displays:

```text
Hello World
```

in the center of a yellow Activity screen with:

* Holo Blue text
* 27sp font size
* Bold style
* Italic style

The Activity Life Cycle events are displayed in **Logcat**, while Toast and Snackbar messages demonstrate user notifications.

---

## Conclusion

This practical demonstrates the creation of a basic Android application using Kotlin and XML. It provides an understanding of Android Activity Life Cycle methods and demonstrates how **Logcat, Toast, and Snackbar** can be used to monitor and display Activity events.
