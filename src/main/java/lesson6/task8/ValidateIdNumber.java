package lesson6.task8;

public class ValidateIdNumber {

    public static void validatePersonalId(String id) throws WrongTypeOfDataException, IllegalLengthException {
        if (!(id instanceof String)) {
            throw new WrongTypeOfDataException();
        } else if (id.length() != 11) {
            throw new IllegalLengthException();
        }
    }

    public static void main(String[] args) {
        try {
            validatePersonalId("12345678901");
            System.out.println("Personal Id is valid.");
        } catch (WrongTypeOfDataException | IllegalLengthException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
