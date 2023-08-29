package lesson6.task2;

import lesson6.task0.FileUtils;

import java.io.IOException;

public class PrintEverySecondLine {

    public static void printEverySecondLine(String filePath) throws IOException {
        String content = FileUtils.readFromFile(filePath);
        String[] lines = content.split(System.lineSeparator());
        for (int i = 1; i < lines.length; i += 2) {
            System.out.println(lines[i]);
        }
    }

}
