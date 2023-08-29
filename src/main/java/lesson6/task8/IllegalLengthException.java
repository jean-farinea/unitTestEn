package lesson6.task8;

public class IllegalLengthException extends Exception {

    @Override
    public String getMessage() {
        return "This is a illegal length exception error!";
    }

}
