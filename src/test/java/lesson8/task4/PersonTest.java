package lesson8.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldCompareAgeReturnZero() {
        //given
        Person person1 = new Person("Gandalf", "Grey", 1980, 200, 70);
        Person person2 = new Person("Gandalf", "White", 1980, 200, 70);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldCompareAgeReturnNegativeValue() {
        //given
        Person person1 = new Person("Tony", "Stark", 1980, 170, 80);
        Person person2 = new Person("Peter", "Parker", 2000, 175, 85);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void shouldCompareAgeReturnPositiveValue() {
        //given
        Person person1 = new Person("Frodo", "Baggins", 1980, 135, 60);
        Person person2 = new Person("Bilbo", "Baggins", 1850, 135, 55);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(1, result);
    }

    @Test
    void shouldCompareHeightReturnZero() {
        //given
        Person person1 = new Person("Gandalf", "Grey", 1980, 200, 70);
        Person person2 = new Person("Gandalf", "White", 1980, 200, 70);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldCompareHeightReturnNegativeValue() {
        //given
        Person person1 = new Person("Tony", "Stark", 1980, 170, 80);
        Person person2 = new Person("Peter", "Parker", 2000, 175, 85);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void shouldCompareHeightReturnPositiveValue() {
        //given
        Person person1 = new Person("Frodo", "Baggins", 1980, 135, 60);
        Person person2 = new Person("Bilbo", "Baggins", 1850, 135, 55);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(1, result);
    }

    @Test
    void shouldCompareWeightReturnZero() {
        //given
        Person person1 = new Person("Gandalf", "Grey", 1980, 200, 70);
        Person person2 = new Person("Gandalf", "White", 1980, 200, 70);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldCompareWeightReturnNegativeValue() {
        //given
        Person person1 = new Person("Tony", "Stark", 1980, 170, 80);
        Person person2 = new Person("Peter", "Parker", 2000, 175, 85);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void shouldCompareWeightReturnPositiveValue() {
        //given
        Person person1 = new Person("Frodo", "Baggins", 1980, 135, 60);
        Person person2 = new Person("Bilbo", "Baggins", 1850, 135, 55);
        //when
        int result = person1.compareTo(person2);
        //then
        assertEquals(1, result);
    }
}