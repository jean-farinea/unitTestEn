package lesson10.task6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class BirthDate {

    private String dateOfBirthString;
    private LocalDate dateOfBirth;
    private LocalDate currentDate;

    public BirthDate(String dateOfBirthString) {
        this.dateOfBirthString = dateOfBirthString;
        this.dateOfBirth = LocalDate.parse(dateOfBirthString);
        this.currentDate = LocalDate.now();
    }

    public int getAge() {
        return currentDate.getYear() - dateOfBirth.getYear();
    }

    public DayOfWeek getBirthDayOfTheWeek() {
        return dateOfBirth.getDayOfWeek();
    }

    public int getBirthWeekOfYear() {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekOfYear = dateOfBirth.get(weekFields.weekOfWeekBasedYear());
        return weekOfYear;
    }
}
