package lesson3.task5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCheckRightTriangle() {
        //given
        Triangle rightTriangle = new Triangle(3, 4, 5);
        //when
        boolean isRightTriangle = rightTriangle.checkRightTriangle();
        //then
        Assert.assertTrue(isRightTriangle);
    }
}