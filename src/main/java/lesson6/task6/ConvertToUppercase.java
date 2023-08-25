package lesson6.task6;

import lesson6.task0.FileUtils;

import java.io.IOException;

public class ConvertToUppercase {

    public static void convertToUpperCase(String filePath, String newFilePath) throws IOException {
        String content = FileUtils.readFromFile(filePath);
        String newContentFormatted = content.toUpperCase();
        FileUtils.writeToFile(newFilePath, newContentFormatted);
    }

}
