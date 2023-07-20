package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerifierTest {
    @Test
    void shouldVerifyAgeGreaterOrEqual18() {
        //given
        int numberA = 17;
        int numberB = 18;
        int numberC = 19;
        //when
        boolean result1 = AgeVerifier.verifyAgeGreaterOrEqual18(numberA);
        boolean result2 = AgeVerifier.verifyAgeGreaterOrEqual18(numberB);
        boolean result3 = AgeVerifier.verifyAgeGreaterOrEqual18(numberC);
        //then
        Assertions.assertFalse(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
    }

}