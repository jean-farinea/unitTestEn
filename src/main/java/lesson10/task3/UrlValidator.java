package lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public static boolean validateUrl(String url) {

        String regex = "^(https?://)?(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/[a-zA-Z0-9-._~:/?#@!$&'()*+,;=]*)?$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(url);

        return matcher.matches();
    }

}
