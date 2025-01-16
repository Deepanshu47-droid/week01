import java.util.Scanner;

public class PalindromeLogic2 {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Checking palindrome using Logic 2 (Recursive)
        if (isPalindrome(text, 0, text.length() - 1)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

        input.close();
    }
    // Recursive method to check if a string is palindrome
    public static boolean isPalindrome(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindrome(text, start + 1, end - 1);
    }
}
