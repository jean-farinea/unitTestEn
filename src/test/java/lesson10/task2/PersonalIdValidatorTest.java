package lesson10.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalIdValidatorTest {

    @Test
    void shouldValidatePersonalId() {
        //given
        String personalId = "99090911111";
        //when
        boolean actual = PersonalIdValidator.validatePersonalId(personalId);
        //then
        assertTrue(actual);
    }

    @Test
    void shouldNotValidatePersonalId() {
        //given
        String personalId = "990909111";
        //when
        boolean actual = PersonalIdValidator.validatePersonalId(personalId);
        //then
        assertFalse(actual);
    }
}