package lesson4.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        //given
        Rectangle rectangle1 = new Rectangle(10,5);
        double expectedArea = 50;
        //when
        double area = rectangle1.getArea();
        //then
        Assertions.assertEquals(expectedArea, area);
    }

    @Test
    void getPerimeter() {
        //given
        Rectangle rectangle1 = new Rectangle(10,5);
        double expectedPerimeter = 30;
        //when
        double perimeter = rectangle1.getPerimeter();
        //then
        Assertions.assertEquals(expectedPerimeter, perimeter);
    }
}