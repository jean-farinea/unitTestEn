package lesson5.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void shouldCheckIfIsPalindrome() {
        //given
        Text text = new Text();
        //when
        boolean trueExpected = text.isPalindrome("abba");
        //then
        assertTrue(trueExpected);
    }

    @Test
    void shouldCheckIfIsNotPalindrome() {
        //given
        Text text = new Text();
        //when
        boolean falseExpected = text.isPalindrome("abcd");
        //then
        assertFalse(falseExpected);
    }
}