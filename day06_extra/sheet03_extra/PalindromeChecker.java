import java.util.Scanner;

public class PalindromeChecker {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Checking palindrome using (Character Arrays)
        if (isPalindrome(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

        input.close();
    }
    // Method to reverse a string and return the character array
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int reverseIndex = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[reverseIndex++] = text.charAt(i);
        }
        return reversed;
    }

    // Method to check if a string is palindrome by comparing original and reversed arrays
    public static boolean isPalindrome(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
}
