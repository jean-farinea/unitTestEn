package lesson2.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsEvenOrOddTest {

    @Test
    void shouldVerifyIfNumberIsEven() {
        //given
        int numberA = 2;
        //when
        boolean result1 = IsEvenOrOdd.isEven(numberA);
        //then
        Assertions.assertTrue(result1);
    }

    @Test
    void shouldVerifyIfNumberIsNotEven() {
        //given
        int numberA = 3;
        //when
        boolean result1 = IsEvenOrOdd.isEven(numberA);
        //then
        Assertions.assertFalse(result1);
    }
}