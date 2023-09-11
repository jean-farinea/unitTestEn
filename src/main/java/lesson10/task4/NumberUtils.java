package lesson10.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtils {

    String integerPattern = "\\b\\d+\\b";
    String floatPattern = "\\b\\d+\\.\\d+\\b";
    String scientificPattern = "\\b\\d+(\\.\\d+)?[eE][+-]?\\d+\\b";

    Pattern integerRegex = Pattern.compile(integerPattern);
    Pattern floatRegex = Pattern.compile(floatPattern);
    Pattern scientificRegex = Pattern.compile(scientificPattern);

}
