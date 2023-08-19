package lesson4.task4;

public class Uppercase implements TextFormatter {

    public Uppercase() {
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }

}
