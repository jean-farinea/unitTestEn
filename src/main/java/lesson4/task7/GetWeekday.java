package lesson4.task7;

public class GetWeekday {

    public String getWeekday(Weekday weekday) {
        switch (weekday) {
            case Monday:
                return "Monday";
            case Tuesday:
                return "Tuesday";
            case Wednesday:
                return "Wednesday";
            case Thursday:
                return "Thursday";
            case Friday:
                return "Friday";
            case Saturday:
                return "Saturday";
            case Sunday:
                return "Sunday";
            default:
                return "This is not a week day!";
        }
    }
}
