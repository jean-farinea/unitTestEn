package lesson7.task1;

public class NumberUtils {

    public static boolean isDivisibleByTwo(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculateSumOfDigits(double number) {
        double totalSum = 0;
        String numberStr = Double.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                totalSum += digit;
            }
        }
        return totalSum;
    }

}
