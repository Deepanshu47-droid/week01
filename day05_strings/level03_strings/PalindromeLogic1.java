import java.util.Scanner;

public class PalindromeLogic1 {

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Checking palindrome using Logic 1
        if (isPalindrome(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
		//closing the input
        input.close();
    }
    // Method to check if a string is palindrome by comparing start and end characters
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
