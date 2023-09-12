package lesson11.task1;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByThreeTest {

    @Test
    void shouldGetDivisibleByThree() {
        //given
        int start = 1;
        int end = 100;
        //when
        IntStream divisibleByThree = DivisibleByThree.getDivisibleByThree(start, end);
        //then
        assertEquals(divisibleByThree.count(), 33);
    }
}