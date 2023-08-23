package lesson7.task5;

import java.time.Month;

public class SeasonChecker {

    public static Season getSeason(Month month) {
        switch (month) {
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.FALL;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }

}
