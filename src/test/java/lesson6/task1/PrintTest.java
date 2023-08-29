package lesson6.task1;

import lesson6.task0.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @Test
    void shouldPrintFileContent() throws IOException {
        //given
        String filePath = "src/main/resources/data.txt";
        FileUtils.writeToFile(filePath, "Course\nJava\nLesson 6\nFiles\nExceptions\nFiles\nEnd of file");
        String expectedContent = "Course\nJava\nLesson 6\nFiles\nExceptions\nFiles\nEnd of file";
        String actualContent = Print.printFileContent(filePath);
        //when
        Print.printFileContent(filePath);
        //then
        assertEquals(expectedContent, actualContent);
    }
}