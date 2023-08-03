package lesson2.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsEvenOrOddTest {

    @Test
    void verifyIfNumberIsEvenOrOdd() {
        //given
        int numberA = 2;
        int numberB = 3;
        //when
        boolean result1 = IsEvenOrOdd.isEven(numberA);
        boolean result2 = IsEvenOrOdd.isEven(numberB);
        //then
        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }
}