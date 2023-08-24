package lesson6.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class ReverseContent {

    public static void printReverseContent() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("src/main/resources/data.txt"));
        Collections.reverse(lines);
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
