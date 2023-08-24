package lesson6.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordLookUpTest {

    @Test
    void shouldCheckIfContainsWord() throws IOException {
        //given
        boolean expectedTrue = WordLookUp.containsWord("Java");
        boolean expectedFalse = WordLookUp.containsWord("PHP");
        //when

        //then
        Assertions.assertTrue(expectedTrue);
        Assertions.assertFalse(expectedFalse);
    }
}