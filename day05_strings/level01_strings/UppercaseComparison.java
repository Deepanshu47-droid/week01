import java.util.Scanner;

public class UppercaseComparison {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();
        
        // Converting the input text to uppercase using the built-in method
        String builtInUppercase = inputText.toUpperCase();
        
        // Converting the input text to uppercase using the custom method (ASCII)
        String customUppercase = convertToUpperCaseUsingAscii(inputText);
        
        // Comparing both strings using the user-defined method
        boolean isEqual = compareStringsUsingCharAt(builtInUppercase, customUppercase);
        
        // Displaying the results
        System.out.println("Original Text: " + inputText);
        System.out.println("Uppercase using toUpperCase(): " + builtInUppercase);
        System.out.println("Uppercase using custom method: " + customUppercase);
        System.out.println("Are both results equal? " + isEqual);
        
        scanner.close();
    }
    // Method to convert the string to uppercase using ASCII values
    public static String convertToUpperCaseUsingAscii(String text) {
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Checking if the character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                // Converting it to uppercase by adjusting ASCII value
                ch = (char) (ch - 32);
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
        // If all characters match, the strings are equal
        return true;  
    }
}
