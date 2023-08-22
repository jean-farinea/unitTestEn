package lesson4.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldGetArea() {
        //given
        Circle circle1 = new Circle(3);
        double expectedArea = 28.274333882308138;
        //when
        double area = circle1.getArea();
        //then
        Assertions.assertEquals(expectedArea, area);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Circle circle1 = new Circle(3);
        double expectedPerimeter = 18.84955592153876;
        //when
        double perimeter = circle1.getPerimeter();
        //then
        Assertions.assertEquals(expectedPerimeter, perimeter);
    }
}