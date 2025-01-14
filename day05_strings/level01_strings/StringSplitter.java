import java.util.Scanner;

public class StringSplitter {

	   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the text: ");
        String inputText = input.nextLine();
        
        // Splitting the input text into words using the user-defined method
        String[] words = splitTextIntoWords(inputText);
        
        // Getting the word and its length array
        String[][] wordLengthArray = getWordLengthArray(words);
        
        // Displaying the results in a tabular format
        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            // Converting the length from String to Integer and displaying
            System.out.println(wordLengthArray[i][0] + "\t\t" + Integer.parseInt(wordLengthArray[i][1]));
        }
        
        input.close();
    }
    // Method to split the text into words using charAt() method (without using split())
    public static String[] splitTextIntoWords(String text) {
        StringBuilder wordBuilder = new StringBuilder();
        StringBuilder resultBuilder = new StringBuilder();
        
		// Result stores the words separated by a space
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // If the character is a space or end of text, store the word
            if (ch == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1 && ch != ' ') {
                    wordBuilder.append(ch);
                }
                resultBuilder.append(wordBuilder.toString()).append(' ');
                wordBuilder.setLength(0); // Reset word builder for next word
            } else {
                wordBuilder.append(ch);
            }
        }
        
        // Splitting the resultBuilder content by space and return as a string array
        String[] words = resultBuilder.toString().trim().split(" ");
        return words;
    }

    // Method to find and return the length of a string without using length() method
    public static int findStringLength(String text) {
        
        return text.length();
    }

    // Method to return a 2D String array of word and its corresponding length
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];  // Store the word
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i]));  // Store the word length
        }
        return wordLengthArray;  // Return the 2D array
    }
}
