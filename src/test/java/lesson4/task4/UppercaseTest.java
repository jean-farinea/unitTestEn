package lesson4.task4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UppercaseTest {

    @Test
    void shouldFormatTextToUpperCase() {
        //given
        Uppercase formatter = new Uppercase();
        String textToFormat = "This Should Be All Upper Case";
        String expectedText = "THIS SHOULD BE ALL UPPER CASE";
        //when
        String formattedText = formatter.formatText(textToFormat);
        //then
        Assert.assertEquals(expectedText, formattedText);
    }
}