package lesson4.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldGetArea() {
        //given
        Square square1 = new Square(10);
        double expectedArea = 100;
        //when
        double area = square1.getArea();
        //then
        Assertions.assertEquals(expectedArea, area);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Square square1 = new Square(10);
        double expectedPerimeter = 40;
        //when
        double perimeter = square1.getPerimeter();
        //then
        Assertions.assertEquals(expectedPerimeter, perimeter);

    }
}