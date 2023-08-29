package lesson7.task2;

public class TextConverter {

    public static String convertTextToCapital(String text) throws NullPointerException {
        if (text == null) {
            throw new NullPointerException("Text is null");
        }
        String convertedText = text.toUpperCase();
        return convertedText;
    }
}
