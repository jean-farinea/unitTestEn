package lesson6.task9;

public class DivisibilityChecker {

    public static void validate(int[] values) throws IllegalArgumentException {
        for (int value : values) {
            try {
                checkDivisibilityByThree(value);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Error for number " + value + ": " + e.getMessage());
            }
        }
    }

    public static void checkDivisibilityByThree(int number) {
        if (number % 3 != 0) {
            throw new IllegalArgumentException(number + " is not divisible by 3.");
        }
    }

}
