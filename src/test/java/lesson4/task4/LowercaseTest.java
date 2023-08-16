package lesson4.task4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowercaseTest {

    @Test
    void shouldFormatTextToLowerCase() {
        //given
        Lowercase formatter = new Lowercase();
        String textToFormat = "This Should Be All Lower Case";
        String expectedText = "this should be all lower case";
        //when
        String formattedText = formatter.formatText(textToFormat);
        //then
        Assert.assertEquals(expectedText, formattedText);
    }
}