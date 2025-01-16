import java.util.Scanner;

public class FirstUniqueCharacter {
	// Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Finding the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Displaying the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        // Closing the Scanner
        input.close();
    }
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        // creating Array to store frequency of each character (ASCII values 0-255)
        int[] frequency = new int[256];

        // Calculating the frequency of each character in the text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Finding the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }
		// Returning null character if no non-repeating character is found
        return '\0'; 
    }
}
