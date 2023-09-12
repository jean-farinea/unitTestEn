package lesson11.task1;

import java.util.stream.IntStream;

public class DivisibleByThree {

    public static IntStream getDivisibleByThree(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .filter(n -> n % 3 == 0)
                .peek(System.out::println);
    }

}
