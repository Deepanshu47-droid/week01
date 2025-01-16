import java.util.Scanner;

public class CharacterFrequencyNested {

    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Finding character frequencies
        String[] frequencies = findCharacterFrequencies(text);

        // Displaying the result
        System.out.println("Character Frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }

        // Closing the Scanner
        input.close();
    }
    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray(); // Convert string to char array
        int[] frequencies = new int[characters.length]; // Array to store frequencies

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') { // Skip already processed characters
                continue;
            }

            // Initializing frequency to 1 for the current character
            frequencies[i] = 1;

            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequencies[i]++;
                    characters[j] = '0'; // Mark duplicate as processed
                }
            }
        }

        // Creating a 1D String array to store characters and their frequencies
        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0') uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;

        // Storing unique characters and their frequencies in the result array
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " -> " + frequencies[i];
                index++;
            }
        }

        return result;
    }
}
