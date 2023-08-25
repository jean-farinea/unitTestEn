package lesson6.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class idValidatorTest {

    @Test
    void shouldValidatePersonalId() {
        //given
        String id = "12345678910";
        //when
        assertThrows(IllegalArgumentException.class, () -> idValidator.validatePersonalId("123456789"));
        assertThrows(IllegalArgumentException.class, () -> idValidator.validatePersonalId("123456789a"));
        assertDoesNotThrow(() -> idValidator.validatePersonalId(id));
    }

}
