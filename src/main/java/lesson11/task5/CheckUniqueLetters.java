package lesson11.task5;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckUniqueLetters {

    public List<String> words;

    public CheckUniqueLetters(List<String> words) {
        this.words = words;
    }

    public static Set<Character> checkUniqueLetters(List<String> words) {
        Set<Character> uniqueLetters = words.stream()
                .flatMap(word -> word.chars().mapToObj(ch -> (char) ch))
                .map(Character::toUpperCase)
                .distinct()
                .collect(Collectors.toSet());

        System.out.println("Unique Capitalized Letters: " + uniqueLetters);
        return uniqueLetters;
    }

}
