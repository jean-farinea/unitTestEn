package lesson6.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class CharCounterTest {

    @Test
    void shouldCountChars() throws IOException {
        //given
        int expectedAmount = 55;
        int actualAmount = CharCounter.countChars();
        //when
        CharCounter.countChars();
        //then
        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}