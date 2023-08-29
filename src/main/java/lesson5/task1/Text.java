package lesson5.task1;

import java.util.Scanner;

public class Text {

    private Scanner textScan = new Scanner(System.in);

    public String checkPalindrome() {
        System.out.println("Enter a text to be checked:");
        String inputText = textScan.nextLine();
        if (inputText.isEmpty()) {
            return "Text is Empty!";
        } else if (isPalindrome(inputText)) {
            return "Text is a palindrome and the length of the text is " + inputText.length();
        } else {
            return "Text is not a palindrome!";
        }
    }

    public boolean isPalindrome(String newText) {
        String reverseText = "";
        boolean isPalindrome = false;
        for (int i = newText.length() - 1; i >= 0; i--) {
            reverseText = reverseText + newText.charAt(i);
        }
        if (newText.equals(reverseText)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

}
