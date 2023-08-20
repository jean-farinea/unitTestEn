package lesson6.task7;

public class SquareRoot {

    public static void main(String[] args) {
        try {
            calculateSquareRoot(-6564);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double calculateSquareRoot(double numberA) {
        if (numberA < 0) {
            throw new IllegalArgumentException("Error: you can't calculate square root of a negative number!");
        }
        double squareRoot = Math.sqrt(numberA);
        return squareRoot;
    }
}
