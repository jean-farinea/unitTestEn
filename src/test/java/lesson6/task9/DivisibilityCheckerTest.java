package lesson6.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibilityCheckerTest {

    @Test
    void shouldCheckDivisibilityByThree() {
        //given
        int[] values = {3, 6, 9, 12, 15};
        //then
        assertDoesNotThrow(() -> DivisibilityChecker.validate(values));
    }

    @Test
    void shouldThrowExceptionWhenNotDivisibleByThree() {
        //given
        int[] values = {3, 6, 9, 12, 13};
        //then
        assertThrows(IllegalArgumentException.class, () -> DivisibilityChecker.validate(values));
    }

}