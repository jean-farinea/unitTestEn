package lesson6.task6;

import lesson6.task0.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToUppercaseTest {

    @Test
    void shouldConvertToUpperCase() throws IOException {
        //given
        String filePath = "src/main/resources/data.txt";
        String newFilePath = "src/main/resources/output.txt";
        FileUtils.writeToFile(filePath, "Course\nJava\nLesson 6\nFiles\nExceptions\nFiles\nEnd of file");
        String expectedContent = "COURSE\nJAVA\nLESSON 6\nFILES\nEXCEPTIONS\nFILES\nEND OF FILE";
        //when
        ConvertToUppercase.convertToUpperCase(filePath, newFilePath);
        String actualContent = FileUtils.readFromFile(newFilePath);
        //then
        assertEquals(expectedContent, actualContent);
    }
}