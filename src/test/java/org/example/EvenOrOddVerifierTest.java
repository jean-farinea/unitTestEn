package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenOrOddVerifierTest {

    @Test
    void verifyIfEvenOrOdd() {
        //given
        int numberA = 2;
        int numberB = 3;
        //when
        String result1 = EvenOrOddVerifier.isEvenOrOdd(numberA);
        String result2 = EvenOrOddVerifier.isEvenOrOdd(numberB);
        //then
        Assertions.assertSame("The number is Even", result1);
        Assertions.assertSame("The number is Odd", result2);
    }
}