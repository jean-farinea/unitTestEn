package lesson7.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TextLengthTest {

    @ParameterizedTest
    @MethodSource("provideSampleTexts")
    void shouldCheckCalculateTextLength(String text) {
        int expectedLength = text.length();
        int calculatedLength = TextLength.calculateTextLength(text);
        Assertions.assertEquals(expectedLength, calculatedLength);
    }

    private static Stream<String> provideSampleTexts() {
        return Stream.of("first text", "second text", "third text");
    }
}