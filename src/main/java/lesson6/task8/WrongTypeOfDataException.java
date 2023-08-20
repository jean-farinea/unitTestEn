package lesson6.task8;

public class WrongTypeOfDataException extends Exception {

    @Override
    public String getMessage() {
        return "This is a wrong type of data exception error!";
    }
}
