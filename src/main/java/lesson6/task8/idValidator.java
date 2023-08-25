package lesson6.task8;

public class idValidator {

    public static void validatePersonalId(String id) throws WrongTypeOfDataException, IllegalLengthException {
        if (!(id instanceof String)) {
            throw new WrongTypeOfDataException();
        } else if (id.length() != 11) {
            throw new IllegalLengthException();
        }
    }

}
