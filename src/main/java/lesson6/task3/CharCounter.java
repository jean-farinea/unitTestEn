package lesson6.task3;

import lesson6.task0.FileUtils;

import java.io.IOException;

public class CharCounter {

    public static int countChars(String filePath) throws IOException {
        String content = FileUtils.readFromFile(filePath);
        int totalOfChars = content.length();
        return totalOfChars;
    }

}
