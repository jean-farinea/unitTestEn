package lesson6.task1;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @Test
    void shouldPrintFileContent() throws IOException {
        //given
        String expectedContent = "Course\nJava\nLesson 6\nFiles\nExceptions\nFiles\nEnd of file";
        String actualContent = Print.printFileContent();
        //when
        Print.printFileContent();
        //then
        assertEquals(expectedContent, actualContent);
    }
}