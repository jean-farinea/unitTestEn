package lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalIdValidator {

    public static boolean validatePersonalId(String personalId) {
        String regex = "^\\d{11}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(personalId);

        return matcher.matches();
    }
}
