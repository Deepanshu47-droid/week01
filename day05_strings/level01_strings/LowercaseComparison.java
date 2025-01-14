import java.util.Scanner;

public class LowercaseComparison {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();
        
        // Converting the input text to lowercase using the built-in method
        String builtInLowercase = inputText.toLowerCase();
        
        // Converting the input text to lowercase using the custom method (ASCII)
        String customLowercase = convertToLowerCaseUsingAscii(inputText);
        
        // Comparing both strings using the user-defined method
        boolean isEqual = compareStringsUsingCharAt(builtInLowercase, customLowercase);
        
        // Displaying the results
        System.out.println("Original Text: " + inputText);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowercase);
        System.out.println("Lowercase using custom method: " + customLowercase);
        System.out.println("Are both results equal? " + isEqual);
        
        // Splitting the text into words and getting their lengths
        String[][] wordLengthArray = splitTextIntoWordsAndLengths(inputText);
        
        // Displaying the words and their lengths
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println("Word: " + wordLengthArray[i][0] + ", Length: " + wordLengthArray[i][1]);
        }
        
        scanner.close();
    }
    // Method to convert the string to lowercase using ASCII values
    public static String convertToLowerCaseUsingAscii(String text) {
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Converting it to lowercase by adjusting the ASCII value
                ch = (char) (ch + 32);
            }
			// Adding the character to the result
            result.append(ch);  
        }
        // Returning the converted string
        return result.toString();  
    }
    
    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            // If lengths are not the same, they are not equal
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                // If any character doesn't match, the strings are not equal
                return false;
            }
        }
        
        return true;  // If all characters match, the strings are equal
    }
    
    // Method to split the text into words and return a 2D array with words and their lengths
    public static String[][] splitTextIntoWordsAndLengths(String text) {
        // Split the input text into words using space as a delimiter
        String[] words = text.split(" ");
        
        // Create a 2D array to store words and their lengths
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];  // Store the word
            wordLengthArray[i][1] = String.valueOf(words[i].length());  // Store the word length
        }
        
        return wordLengthArray;  // Return the 2D array
    }
}
