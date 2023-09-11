package lesson10.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlValidatorTest {

    @Test
    void shouldValidateUrl() {
        //given
        String url = "http://www.onet.pl";
        //when
        boolean actual = UrlValidator.validateUrl(url);
        //then
        assertTrue(actual);
    }

    @Test
    void shouldNotValidateUrl() {
        //given
        String url = "ftp://www.example.com";
        //when
        boolean actual = UrlValidator.validateUrl(url);
        //then
        assertFalse(actual);
    }
}