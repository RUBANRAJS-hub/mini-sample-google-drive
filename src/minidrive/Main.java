package minidrive;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        StorageManager storageManager = new StorageManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=========================================");
        System.out.println("        Welcome to Mini Google Drive     ");
        System.out.println("=========================================");
        
        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Upload File");
            System.out.println("2. View All Files");
            System.out.println("3. Search File");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("> ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter the full path of the file to upload: ");
                    String uploadPath = scanner.nextLine().trim();
                    storageManager.uploadFile(uploadPath);
                    break;
                case "2":
                    storageManager.viewFiles();
                    break;
                case "3":
                    System.out.print("Enter filename or keyword to search: ");
                    String keyword = scanner.nextLine().trim();
                    storageManager.searchFile(keyword);
                    break;
                case "4":
                    System.out.print("Enter the exact filename to delete: ");
                    String deleteName = scanner.nextLine().trim();
                    storageManager.deleteFile(deleteName);
                    break;
                case "5":
                    System.out.println("Exiting Mini Google Drive. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }
}
