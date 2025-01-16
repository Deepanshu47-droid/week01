import java.util.Scanner;
public class VowelConsonantChecker {
	public static void main(String[] args) {
		
		//creating scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//taking user input for a string 
		System.out.print("Enter a string : ");
		String str = input.nextLine();
		
		//creating array status to store status (vowel, consonant or invalid) of string
		String[][] status = checkString(str);
		
		//printing whether a character is vowel, consonant of not a character
		for(int i=0; i<str.length(); i++) {
			System.out.println("Character " + status[i][0] + " is " + status[i][1]);
		}
		
		//closing the input
		input.close();
	}
	// Method to convert the string to lowercase using ASCII values
    public static String convertToLower(String text) {
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
	//method to check if a number is vowel or consonant
	public static String[][] checkString(String str) {
		//converting string in lowercase
		str = convertToLower(str);
		
		//creating 2d array status to store status (vowel, consonant or invalid) of string
		String[][] status = new String[str.length()][2];
		
		
		//checking each character of string
		for(int i=0; i<str.length(); i++) {
			//storing the character in 2d array's first index
			status[i][0] = String.valueOf(str.charAt(i));
			
			//checking for invalid character
			if((int)str.charAt(i) < 65 || ((int)str.charAt(i) > 91 && (int)str.charAt(i) < 97) || (int)str.charAt(i) > 123) {
				status[i][1] = "not a letter";
			}else if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				status[i][1] = "vowel"; //checking for vowel
			} else {
				status[i][1] = "consonant"; //checking for consonant
			}
		}
		//returning the status array
		return status;
	}
}