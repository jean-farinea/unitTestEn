package lesson11.task5;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CheckUniqueLettersTest {

    @Test
    void shouldCheckUniqueLetters() {
        // Given
        List<String> words = List.of("Hello", "World", "Java", "C");
        // When
        Set<Character> uniqueLetters = CheckUniqueLetters.checkUniqueLetters(words);
        // Then
        assertEquals(11, uniqueLetters.size()); // The expected count of unique letters in these words
    }

}