package task9;

public class DivisibilityByThree {

    public void validate(int[] values) {
        for (int value : values) {
            try {
                checkDivisibility(value);
            } catch (IllegalArgumentException e) {
                System.out.println("Error for number " + value + ": " + e.getMessage());
            }
        }
    }

    private static void checkDivisibility(int number) {
        if (number % 3 != 0) {
            throw new IllegalArgumentException(number + " is not divisible by 3.");
        }
    }

    public static void main(String[] args) {
        int[] values = {9, 12, 15, 7, 18, 22};
        DivisibilityByThree validator = new DivisibilityByThree();
        validator.validate(values);
    }

}
