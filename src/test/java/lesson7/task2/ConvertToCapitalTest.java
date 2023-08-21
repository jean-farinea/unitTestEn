package lesson7.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToCapitalTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"first text", "second text", "third text"})
    void shouldCheckIfTextIsConvertedToCapital(String text) {
        String expectedText = text.toUpperCase();
        String convertedText = ConvertToCapital.convertTextToCapital(text);
        Assertions.assertEquals(convertedText, expectedText);
    }
}