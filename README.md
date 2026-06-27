# Mini Google Drive

## Abstract

Mini Google Drive is a Java-based file management system that simulates cloud storage functionality in a local environment. The system allows users to upload, store, search, and manage different types of files such as images and videos within a structured directory system.

This project is designed to demonstrate core concepts of Java programming including file handling, object-oriented programming, and system design without using any external database or cloud services.

## 🎯 Objective

The main objective of this project is to create a simplified version of a cloud storage system that helps users manage digital files efficiently using a console-based Java application.

## ⚙️ Key Features

- **Upload Files**: Upload image and video files into local storage.
- **Automatic Categorization**: Files are automatically organized into folders (e.g., `images/`, `videos/`) based on their extensions.
- **View Files**: View all stored files in a tree-like directory structure.
- **Search Files**: Search for files by name or keyword.
- **Delete Files**: Delete unwanted files from the storage.
- **Interactive UI**: Simple and user-friendly console interface.

## 🧠 Technologies Used

- Java (Core)
- File Handling (`java.io` and `java.nio.file`)
- Object-Oriented Programming (OOP)
- Local File System Storage

## 📁 System Design

The application stores files in a structured folder system within the project root:

```
storage/
├── images/     # Stores .jpg, .png, .gif, etc.
├── videos/     # Stores .mp4, .mkv, .avi, etc.
└── others/     # Stores unsupported file types
```

Each file is processed and stored based on its extension type.

## 🚀 How to Run

1. **Compile the Java files**:
   Ensure you have Java installed on your system. Open your terminal in the project directory and run:
   ```bash
   javac -d out src/minidrive/*.java
   ```

2. **Run the Application**:
   Execute the compiled main class using:
   ```bash
   java -cp out minidrive.Main
   ```

3. **Interact**:
   Follow the on-screen menu to upload, view, search, or delete your files.

## 🌟 Outcome

This project helps in understanding real-world file management systems and improves skills in Java I/O operations, logic building, and basic system architecture. It serves as a foundation for developing advanced cloud-based applications in the future.
