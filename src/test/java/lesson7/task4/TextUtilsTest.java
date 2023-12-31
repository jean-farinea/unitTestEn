package lesson7.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

class TextUtilsTest {

    @ParameterizedTest
    @MethodSource("provideSampleTexts")
    void shouldCheckCalculateTextLength(String text) {
        //given
        int expectedLength = text.length();
        //when
        int calculatedLength = TextUtils.calculateTextLength(text);
        //then
        Assertions.assertEquals(expectedLength, calculatedLength);
    }

    @Test
    @NullAndEmptySource
    void shouldThrowExceptionWhenTextIsNull() {
        //given
        String nullText = null;
        //then
        Assertions.assertThrows(NullPointerException.class, () -> TextUtils.calculateTextLength(nullText));
    }

    private static Stream<String> provideSampleTexts() {
        return Stream.of("first text", "second text", "third text");
    }
}