package lesson10.task6;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class BirthDateTest {

    @Test
    void shouldGetAge() {
        //given
        BirthDate birthDate = new BirthDate("2000-01-08");
        int expectedAge = 23;
        //when
        int age = birthDate.getAge();
        //then
        assertEquals(expectedAge, age);
    }

    @Test
    void shouldGetBirthDayOfWeek() {
        //given
        BirthDate birthDate = new BirthDate("2000-01-08");
        DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;
        //when
        DayOfWeek dayOfWeek = birthDate.getBirthDayOfTheWeek();
        //then
        assertEquals(expectedDayOfWeek, dayOfWeek);
    }

    @Test
    void shouldGetBirthWeekOfYear() {
        //given
        BirthDate birthDate = new BirthDate("2000-01-08");
        int expectedWeekOfYear = 1;
        //when
        int weekOfYear = birthDate.getBirthWeekOfYear();
        //then
        assertEquals(expectedWeekOfYear, weekOfYear);
    }
}