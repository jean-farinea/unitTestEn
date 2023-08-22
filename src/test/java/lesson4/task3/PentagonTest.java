package lesson4.task3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PentagonTest {

    @Test
    void shouldCalculatePentagonArea() {
        //given
        Pentagon pentagon = new Pentagon(5);
        double expectedArea = 43.01;
        double delta = 0.01;
        //when
        double pentagonArea = pentagon.calculateArea();
        //then
        Assert.assertEquals(expectedArea, pentagonArea, delta);
    }

    @Test
    void shouldCalculatePentagonPerimeter() {
        //given
        Pentagon pentagon = new Pentagon(5);
        double expectedPerimeter = 25.0;
        double delta = 0.01;
        //when
        double pentagonPerimeter = pentagon.calculatePerimeter();
        //then
        Assert.assertEquals(expectedPerimeter, pentagonPerimeter, delta);
    }
}