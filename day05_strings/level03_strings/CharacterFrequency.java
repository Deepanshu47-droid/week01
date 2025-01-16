import java.util.Scanner;

public class CharacterFrequency {
	// Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Finding character frequencies
        int[][] frequencies = findCharacterFrequencies(text);

        // Displaying the result
        System.out.println("Character Frequencies:");
        for (int[] freq : frequencies) {
            System.out.println((char) freq[0] + " -> " + freq[1]);
        }

        // Closing the Scanner
        input.close();
    }

    // Method to find the frequency of characters in a string
    public static int[][] findCharacterFrequencies(String text) {
        // Array to store the frequency of each character (ASCII values 0-255)
        int[] frequency = new int[256];

        // Calculating the frequency of each character in the text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Counting unique characters
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Creating a 2D array to store characters and their frequencies
        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i; // Store ASCII value of the character
                result[index][1] = frequency[i]; // Store frequency
                index++;
            }
        }
        return result;
    }

}
