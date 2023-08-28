package lesson6.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibilityCheckerTest {

    @Test
    void shouldCheckDivisibilityByThree() {
        //given
        int[] values = {3, 6, 9, 12, 13};
        int[] values2 = {3, 6, 9, 12, 15};
        //when
        DivisibilityChecker.validate(values);
        //then
        assertThrows(IllegalArgumentException.class, () -> DivisibilityChecker.validate(values));
        assertDoesNotThrow(() -> DivisibilityChecker.validate(values2));
    }

}