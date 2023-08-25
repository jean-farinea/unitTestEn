package lesson6.task4;

import lesson6.task0.FileUtils;

import java.io.IOException;

public class WordLookUp {

    public static boolean containsWord(String wordToLookUp, String filePath) throws IOException {
        String content = FileUtils.readFromFile(filePath);
        if (content.contains(wordToLookUp)) {
            return true;
        } else {
            return false;
        }
    }

}
