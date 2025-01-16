import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Finding character frequencies
        String[][] frequencies = findCharacterFrequencies(text);

        // Displaying the result
        System.out.println("Character Frequencies:");
        for (String[] freq : frequencies) {
            System.out.println(freq[0] + " -> " + freq[1]);
        }

        // Closing the Scanner
        input.close();
    }
    // Method to find unique characters in a string using charAt()
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Checking if the character has already been encountered
            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, adding it to the tempUnique array
            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Creating an array of the exact size to hold the unique characters
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(tempUnique, 0, uniqueChars, 0, uniqueCount);
        return uniqueChars;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        // Finding unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Creating a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            int frequency = 0;

            // Counting frequency of the unique character in the text
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChar) {
                    frequency++;
                }
            }

            // Storing the character and its frequency
            result[i][0] = String.valueOf(uniqueChar);
            result[i][1] = String.valueOf(frequency);
        }
        return result;
    }
}
