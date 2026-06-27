package minidrive;

import java.util.Arrays;
import java.util.List;

public class FileTypeUtils {
    
    private static final List<String> IMAGE_EXTENSIONS = Arrays.asList("jpg", "jpeg", "png", "gif", "bmp");
    private static final List<String> VIDEO_EXTENSIONS = Arrays.asList("mp4", "avi", "mkv", "mov", "wmv");

    public static String getFileType(String fileName) {
        String extension = getExtension(fileName).toLowerCase();
        
        if (IMAGE_EXTENSIONS.contains(extension)) {
            return "images";
        } else if (VIDEO_EXTENSIONS.contains(extension)) {
            return "videos";
        }
        
        return "others";
    }

    private static String getExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex + 1);
        }
        return "";
    }
}
