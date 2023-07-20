package org.example;

public class EvenOrOddVerifier {

    public static String isEvenOrOdd(int number){
        if (number %2 == 0) {
            return "The number is Even";
        } else {
            return "The number is Odd";
        }
    }
}
