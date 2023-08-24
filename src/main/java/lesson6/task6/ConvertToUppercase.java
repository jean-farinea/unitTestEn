package lesson6.task6;

import lesson6.task0.FileUtils;

import java.io.IOException;

public class ConvertToUppercase {

    public static void convertToUpperCase() throws IOException {
        String filePath = "src/main/resources/data.txt";
        String content = FileUtils.readFromFile(filePath);
        String newContentFormatted = content.toUpperCase();
        FileUtils.writeToFile("src/main/resources/output.txt", newContentFormatted);
    }

    public static void main(String[] args) throws IOException {
        convertToUpperCase();
    }
}
