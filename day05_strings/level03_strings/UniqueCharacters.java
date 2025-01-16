import java.util.Scanner;

public class UniqueCharacters {
	// Main method
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Finding unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Displaying the result
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        // Closing the Scanner
        input.close();
    }
    // Method to find the length of the string without using the built-in length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Checking if the character has already been added to the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, adding it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Creating a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }
}
