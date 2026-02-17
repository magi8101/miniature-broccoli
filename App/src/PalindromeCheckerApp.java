import java.util.*;


public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}