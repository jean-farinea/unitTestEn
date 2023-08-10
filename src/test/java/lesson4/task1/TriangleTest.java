package lesson4.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldGetArea() {
        //given
        Triangle triangle1 = new Triangle(3,4,5);
        double expectedArea = 6;
        //when
        double area = triangle1.getArea();
        //then
        Assertions.assertEquals(expectedArea, area);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Triangle triangle1 = new Triangle(3,4,5);
        double expectedPerimeter = 12;
        //when
        double perimeter = triangle1.getPerimeter();
        //then
        Assertions.assertEquals(expectedPerimeter, perimeter);
    }
}