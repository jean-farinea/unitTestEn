package lesson6.task4;

import lesson6.task0.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordLookUpTest {

    @Test
    void shouldCheckIfContainsWord() throws IOException {
        //given
        String filePath = "src/main/resources/data.txt";
        FileUtils.writeToFile(filePath, "Course\nJava\nLesson 6\nFiles\nExceptions\nFiles\nEnd of file");
        //when
        boolean expectedTrue = WordLookUp.containsWord("Java", filePath);
        boolean expectedFalse = WordLookUp.containsWord("PHP", filePath);
        //then
        Assertions.assertTrue(expectedTrue);
        Assertions.assertFalse(expectedFalse);
    }
}