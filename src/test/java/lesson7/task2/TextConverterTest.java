package lesson7.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TextConverterTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"first text", "second text", "third text"})
    void shouldCheckIfTextIsConvertedToCapital(String text) {
        //given
        String expectedText = text.toUpperCase();
        //when
        String convertedText = TextConverter.convertTextToCapital(text);
        //then
        Assertions.assertEquals(convertedText, expectedText);
        assertThrows(NullPointerException.class, () -> TextConverter.convertTextToCapital(null));
    }
}