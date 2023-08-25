package lesson6.task3;

import lesson6.task0.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class CharCounterTest {

    @Test
    void shouldCountChars() throws IOException {
        //given
        String filePath = "src/main/resources/data.txt";
        FileUtils.writeToFile(filePath, "Course\nJava\nLesson 6\nFiles\nExceptions\nFiles\nEnd of file");
        int expectedAmount = 55;
        //when
        int actualAmount = CharCounter.countChars(filePath);
        //then
        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}