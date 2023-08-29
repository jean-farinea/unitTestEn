package lesson6.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdValidatorTest {

    @Test
    void shouldValidatePersonalId() {
        //given
        String id = "12345678910";
        //then
        assertDoesNotThrow(() -> IdValidator.validatePersonalId(id));
    }

    @Test
    void shouldThrowExceptionWhenIdIsInvalid() {
        //given
        String invalidId = "123456789";
        //then
        assertThrows(IllegalLengthException.class, () -> IdValidator.validatePersonalId(invalidId));
    }

    @Test
    void shouldThrowExceptionWhenIdIsNull() {
        //given
        String nullId = null;
        //then
        assertThrows(WrongTypeOfDataException.class, () -> IdValidator.validatePersonalId(nullId));
    }

}
