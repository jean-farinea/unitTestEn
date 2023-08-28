package lesson7.task4;

public class TextUtils {

    public static int calculateTextLength(String text) throws NullPointerException {
        if (text == null) {
            throw new NullPointerException("Text is null");
        }
        int textLength = text.length();
        return textLength;
    }

}
