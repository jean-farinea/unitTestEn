package lesson6.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareRootTest {

    //test method calculate
    @Test
    void shouldCalculateSquareRoot() {
        //given
        SquareRoot squareRoot = new SquareRoot();
        double expectedRoot = 3;
        //when
        double actualRoot = SquareRoot.calculateSquareRoot(9);
        //then
        assertEquals(expectedRoot, actualRoot);
    }
}