package lesson10.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void shouldReturnTrueWhenIsValidPassword() {
        //given valid password
        String password = "Abcd3456";
        //when
        boolean actual = PasswordValidator.isValidPassword(password);
        //then
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenIsNotValidPassword() {
        //given '23' together is not a valid password
        String password = "Abcd1234";
        //when
        boolean actual = PasswordValidator.isValidPassword(password);
        //then
        assertFalse(actual);
    }
}