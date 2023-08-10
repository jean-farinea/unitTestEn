package lesson3.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConversionTest {

    @Test
    void shouldConvertMinutesToSeconds() {
        //given
        int minutesToBeConverted = 100;
        //when
        int totalInSeconds = Conversion.convertMinutesToSeconds(minutesToBeConverted);
        //then
        Assertions.assertEquals(6000, totalInSeconds);
    }
    
}