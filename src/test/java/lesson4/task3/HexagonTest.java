package lesson4.task3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexagonTest {

    @Test
    void shouldCalculateHexagonArea() {
        //given
        Hexagon hexagon = new Hexagon(5);
        double expectedArea = 64.95;
        double delta = 0.01;
        //when
        double hexagonArea = hexagon.calculateArea();
        //then
        Assert.assertEquals(expectedArea, hexagonArea, delta);
    }

    @Test
    void shouldCalculateHexagonPerimeter() {
        //given
        Hexagon hexagon = new Hexagon(5);
        double expectedPerimeter = 30;
        double delta = 0.01;
        //when
        double hexagonPerimeter = hexagon.calculatePerimeter();
        //then
        Assert.assertEquals(expectedPerimeter, hexagonPerimeter, delta);
    }
}