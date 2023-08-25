package lesson6.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class ReverseContent {

    public static void printReverseContent(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filePath));
        Collections.reverse(lines);
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
