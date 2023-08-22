package lesson6.task0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public static String readFromFile(String filePath) {
        String content = null;
        try {
            content = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            System.out.println("Problem with reading a file!! error message: " + e.getLocalizedMessage());
        }
        return content;
    }

    public static void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Path.of(pathToFile), text);
        } catch (IOException exception) {
            System.out.println("Problem with saving a file: " + exception.getMessage());
        }
    }

}
