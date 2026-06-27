package minidrive;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class StorageManager {
    
    private static final String STORAGE_ROOT = "storage";
    
    public StorageManager() {
        initStorage();
    }
    
    private void initStorage() {
        createDirectory(STORAGE_ROOT + "/images");
        createDirectory(STORAGE_ROOT + "/videos");
        createDirectory(STORAGE_ROOT + "/others");
    }
    
    private void createDirectory(String pathStr) {
        File dir = new File(pathStr);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
    
    public void uploadFile(String sourceFilePath) {
        // Strip quotes if user pasted path with quotes
        if (sourceFilePath.startsWith("\"") && sourceFilePath.endsWith("\"")) {
            sourceFilePath = sourceFilePath.substring(1, sourceFilePath.length() - 1);
        }
        
        File sourceFile = new File(sourceFilePath);
        
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Error: File does not exist or is not a valid file.");
            return;
        }
        
        String category = FileTypeUtils.getFileType(sourceFile.getName());
        String targetDir = STORAGE_ROOT + "/" + category;
        
        Path targetPath = Paths.get(targetDir, sourceFile.getName());
        
        try {
            Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Success: File uploaded to " + category + " folder.");
        } catch (IOException e) {
            System.out.println("Error: Failed to upload file. " + e.getMessage());
        }
    }
    
    public void viewFiles() {
        File root = new File(STORAGE_ROOT);
        if (!root.exists()) {
            System.out.println("Storage is empty.");
            return;
        }
        
        System.out.println("\n--- Stored Files ---");
        listDirectoryContents(root, 0);
        System.out.println("--------------------");
    }
    
    private void listDirectoryContents(File dir, int level) {
        File[] files = dir.listFiles();
        if (files == null) return;
        
        for (File file : files) {
            StringBuilder indent = new StringBuilder();
            for (int i = 0; i < level; i++) indent.append("  ");
            
            if (file.isDirectory()) {
                System.out.println(indent + "[" + file.getName() + "]");
                listDirectoryContents(file, level + 1);
            } else {
                System.out.println(indent + "- " + file.getName());
            }
        }
    }
    
    public void searchFile(String keyword) {
        System.out.println("\n--- Search Results for '" + keyword + "' ---");
        boolean found = searchInDirectory(new File(STORAGE_ROOT), keyword.toLowerCase());
        if (!found) {
            System.out.println("No files found matching the keyword.");
        }
        System.out.println("----------------------------------");
    }
    
    private boolean searchInDirectory(File dir, String keyword) {
        boolean found = false;
        File[] files = dir.listFiles();
        if (files == null) return false;
        
        for (File file : files) {
            if (file.isDirectory()) {
                found |= searchInDirectory(file, keyword);
            } else {
                if (file.getName().toLowerCase().contains(keyword)) {
                    System.out.println("Found: " + file.getAbsolutePath());
                    found = true;
                }
            }
        }
        return found;
    }
    
    public void deleteFile(String fileName) {
        boolean deleted = deleteInDirectory(new File(STORAGE_ROOT), fileName);
        if (deleted) {
            System.out.println("Success: File '" + fileName + "' has been deleted.");
        } else {
            System.out.println("Error: File '" + fileName + "' not found in storage.");
        }
    }
    
    private boolean deleteInDirectory(File dir, String fileName) {
        File[] files = dir.listFiles();
        if (files == null) return false;
        
        for (File file : files) {
            if (file.isDirectory()) {
                if (deleteInDirectory(file, fileName)) {
                    return true;
                }
            } else {
                if (file.getName().equalsIgnoreCase(fileName)) {
                    return file.delete();
                }
            }
        }
        return false;
    }
}
