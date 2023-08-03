package lesson2.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbersProperly() {
        //given
        double numberA = 1;
        double numberB = 2;
        double expectedResult = 3;
        //when
        double result = Calculator.sum(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldSubtractTwoNumbersProperly() {
        //given
        double numberA = 2;
        double numberB = 1;
        double expectedResult = 1;
        //when
        double result = Calculator.subtract(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldMultiplyTwoNumbersProperly() {
        //given
        double numberA = 2;
        double numberB = 3;
        double expectedResult = 6;
        //when
        double result = Calculator.multiply(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldDivideTwoNumbersProperly() {
        //given
        double numberA = 10;
        double numberB = 2;
        double expectedResult = 5;
        //when
        double result = Calculator.divide(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);
    }

}