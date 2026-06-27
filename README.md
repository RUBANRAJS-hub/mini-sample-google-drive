<div align="center">

  <img src="assets/banner.png" alt="Mini Google Drive 3D Banner" width="100%" style="border-radius: 15px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">

  <h1>☁️ Mini Google Drive ☁️</h1>

  <p>
    <strong>A high-performance, locally simulated cloud storage console application built in Java.</strong>
  </p>

  <p>
    <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
    <img alt="CLI" src="https://img.shields.io/badge/CLI-Terminal-4D4D4D?style=for-the-badge&logo=windows-terminal&logoColor=white" />
    <img alt="OOP" src="https://img.shields.io/badge/Architecture-OOP-00599C?style=for-the-badge&logo=java&logoColor=white" />
  </p>

</div>

<hr>

## 📖 Abstract

Mini Google Drive is a Java-based file management system that beautifully simulates cloud storage functionality entirely within your local environment. It provides a robust engine to upload, store, categorize, search, and manage various types of files (such as images, videos, and documents) using a highly structured backend directory system.

Built strictly without external database dependencies, this project exists to demonstrate mastery over core Java concepts, file I/O streams, object-oriented programming, and fundamental system design architecture.

<br>

## 🎯 Project Objective

To build an efficient, simplified, simulated cloud storage engine. The application empowers users to manage their digital assets intelligently through a streamlined and interactive console interface.

<br>

## ✨ Key Features

| Feature | Description |
| :--- | :--- |
| 📤 **Smart Uploads** | Automatically ingest image and video files into your local storage environment. |
| 🗂️ **Auto-Categorization** | Intelligently sorts files into categorized buckets (e.g., `images/`, `videos/`) by parsing their extensions in real-time. |
| 👁️ **Visual Directory** | Renders a clean, hierarchical tree-view of all your stored digital assets. |
| 🔍 **Deep Search** | Quickly scan your entire storage instance by filename or keyword to locate assets instantly. |
| 🗑️ **Asset Deletion** | Safely remove and permanently delete unwanted files to free up simulated cloud space. |
| 💻 **Interactive CLI** | Navigate through the system using a highly responsive, user-friendly console menu. |

<br>

## 🛠️ System Architecture & Design

The application enforces a strict, robust folder structure at the root level to keep data cleanly segregated:

```text
📦 Mini-Google-Drive
 ┣ 📂 storage
 ┃ ┣ 📂 images      ➔ Parses and routes .jpg, .png, .gif, .bmp
 ┃ ┣ 📂 videos      ➔ Parses and routes .mp4, .mkv, .avi, .mov
 ┃ ┗ 📂 others      ➔ Catch-all bin for unsupported formats
 ┣ 📂 src
 ┃ ┗ 📂 minidrive   ➔ Core source code packages
```

<br>

## 🚀 Getting Started

Follow these instructions to get your local cloud storage running in seconds.

### 1. Compilation
Fire up your terminal (PowerShell, CMD, Bash) in the project's root directory and compile the `.java` files into an `out` directory:
```bash
mkdir -p out
javac -d out src/minidrive/*.java
```

### 2. Execution
Run the compiled byte-code to launch the interactive terminal interface:
```bash
java -cp out minidrive.Main
```

### 3. Interaction
Use the number keys to navigate the console menu. When uploading, simply paste the full absolute path of the file on your computer.

<br>

## 🌟 Learning Outcomes

This software acts as a robust foundation for building advanced, scalable file-management solutions. It heavily relies on:
* **Java I/O & NIO Operations** for rapid file streaming and copying.
* **Logic Building** for recursive directory scanning and searching.
* **Architecture Principles** to decouple logic into dedicated classes (`Main`, `StorageManager`, `FileTypeUtils`).

<hr>
<div align="center">
  <sub>Built with ❤️ using Java.</sub>
</div>
