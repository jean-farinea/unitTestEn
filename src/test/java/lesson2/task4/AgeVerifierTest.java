package lesson2.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerifierTest {

    @Test
    void shouldVerifyIfIsAdult() {
        //given
        int numberA = 17;
        int numberB = 18;
        int numberC = 19;
        //when
        boolean result1 = AgeVerifier.isAdult(numberA);
        boolean result2 = AgeVerifier.isAdult(numberB);
        boolean result3 = AgeVerifier.isAdult(numberC);
        //then
        Assertions.assertFalse(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
    }

}