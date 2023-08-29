package lesson7.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TextConverterTest {

    @ParameterizedTest
    @ValueSource(strings = {"first text", "second text", "third text"})
    void shouldCheckIfTextIsConvertedToCapital(String text) {
        //given
        String expectedText = text.toUpperCase();
        //when
        String convertedText = TextConverter.convertTextToCapital(text);
        //then
        Assertions.assertEquals(convertedText, expectedText);
    }


    @Test
    @NullAndEmptySource
    void shouldThrowExceptionWhenTextIsNull() {
        //given
        String nullText = null;
        //then
        assertThrows(NullPointerException.class, () -> TextConverter.convertTextToCapital(nullText));
    }
}