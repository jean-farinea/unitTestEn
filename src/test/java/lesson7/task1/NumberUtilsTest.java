package lesson7.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8})
    void shouldReturnTrueIfIsDivisibleByTwo(int numberToCheck) {
        Assertions.assertTrue(NumberUtils.isDivisibleByTwo(numberToCheck));
    }

    @ParameterizedTest
    @CsvSource(value = {"123, 6", "456, 15", "789, 24", "012, 012", "345, 345"})
    void shouldCalculateSumOfDigits(int number, int expectedSum) {
        int sum = (int) NumberUtils.calculateSumOfDigits(number);
        Assertions.assertEquals(expectedSum, sum);
    }
}