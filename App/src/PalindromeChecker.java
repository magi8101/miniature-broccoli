import java.util.*;

public class PalindromeChecker {

    /**
     * Checks if a string is a palindrome.
     * It ignores case and non-alphanumeric characters.
     */
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        // Clean the string: remove non-alphanumeric characters and convert to lowercase
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testWord = "Racecar";

        if (isPalindrome(testWord)) {
            System.out.println("'" + testWord + "' is a palindrome!");
        } else {
            System.out.println("'" + testWord + "' is not a palindrome.");
        }
    }
}