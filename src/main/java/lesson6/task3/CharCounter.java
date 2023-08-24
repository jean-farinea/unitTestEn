package lesson6.task3;

import lesson6.task0.FileUtils;

import java.io.IOException;

public class CharCounter {

    public static int countChars() throws IOException {
        String filePath = "src/main/resources/data.txt";
        String content = FileUtils.readFromFile(filePath);
        int totalOfChars = content.length();
        System.out.println(totalOfChars);
        return totalOfChars;
    }
}
