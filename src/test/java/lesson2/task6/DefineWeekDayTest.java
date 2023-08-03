package lesson2.task6;

import lesson2.task6.DefineWeekDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefineWeekDayTest {

    @Test
    void verifyWeekDay() {
        //given
        int day1 = 1;
        int day2 = 2;
        int day3 = 3;
        int day4 = 4;
        int day5 = 5;
        int day6 = 6;
        int day7 = 7;
        int day8 = 8;
        //when
        String isMonday = DefineWeekDay.defineTheDay(day1);
        String isTuesday = DefineWeekDay.defineTheDay(day2);
        String isWednesday = DefineWeekDay.defineTheDay(day3);
        String isThursday = DefineWeekDay.defineTheDay(day4);
        String isFriday = DefineWeekDay.defineTheDay(day5);
        String isSaturday = DefineWeekDay.defineTheDay(day6);
        String isSunday = DefineWeekDay.defineTheDay(day7);
        String isNotValidDay = DefineWeekDay.defineTheDay(day8);
        //then
        Assertions.assertSame(isMonday, "Monday");
        Assertions.assertSame(isTuesday, "Tuesday");
        Assertions.assertSame(isWednesday, "Wednesday");
        Assertions.assertSame(isThursday, "Thursday");
        Assertions.assertSame(isFriday, "Friday");
        Assertions.assertSame(isSaturday, "Weekend");
        Assertions.assertSame(isSunday, "Weekend");
        Assertions.assertSame(isNotValidDay, "There is no such a day!");
    }

}