package lesson10.task5;

import java.util.Calendar;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password.length() < 7) {
            return false;
        }
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return false;
        }
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (Pattern.compile(String.valueOf(currentYear)).matcher(password).find() ||
                Pattern.compile(String.valueOf(currentYear - 2000)).matcher(password).find()) {
            return false;
        }
        return true;
    }

}
