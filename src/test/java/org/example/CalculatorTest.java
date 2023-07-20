package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbersProperly() {
        //given
        int numberA = 1;
        int numberB = 2;
        int expectedResult = 3;
        //when
        int result = Calculator.sum(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    void shouldSubtractTwoNumbersProperly() {
        //given
        int numberA = 2;
        int numberB = 1;
        int expectedResult = 1;
        //when
        int result = Calculator.subtract(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    void shouldMultiplyTwoNumbersProperly() {
        //given
        int numberA = 2;
        int numberB = 3;
        int expectedResult = 6;
        //when
        int result = Calculator.multiply(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    void shouldDivideTwoNumbersProperly() {
        //given
        int numberA = 10;
        int numberB = 2;
        int expectedResult = 5;
        //when
        int result = Calculator.divide(numberA, numberB);
        //then
        Assertions.assertEquals(expectedResult, result);

    }

}