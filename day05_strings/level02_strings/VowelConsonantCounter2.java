import java.util.Scanner;
public class VowelConsonantCounter2 {
	public static void main(String[] args) {
		
		//creating scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//taking user input for a string 
		System.out.print("Enter a string : ");
		String str = input.nextLine();
		
		//creating variable vowel to store count of vowels
		int vowel = countVowel(str);
		//creating variable consonant to store count of vowels
		int consonant = countConsonant(str);
		
		//printing the results
		System.out.println("Number of vowels are " + vowel);
		System.out.println("Number of consonants are " + consonant);
		
		//creating array status to store status (vowel, consonant or invalid) of string
		String[] status = checkString(str);
		
		//printing whether a character is vowel, consonant of not a character
		for(int i=0; i<str.length(); i++) {
			System.out.println("Character " + str.charAt(i) + " is " + status[i]);
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
	public static String[] checkString(String str) {
		//converting string in lowercase
		str = convertToLower(str);
		
		//creating array status to store status (vowel, consonant or invalid) of string
		String[] status = new String[str.length()];
		
		
		//checking each character of string
		for(int i=0; i<str.length(); i++) {
			//checking for invalid character
			if((int)str.charAt(i) < 65 || ((int)str.charAt(i) > 91 && (int)str.charAt(i) < 97) || (int)str.charAt(i) > 123) {
				status[i] = "not a character";
			}else if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				status[i] = "vowel"; //checking for vowel
			} else {
				status[i] = "consonant"; //checking for consonant
			}
		}
		//returning the status array
		return status;
	}
		
		
	//method to count vowels
	public static int countVowel(String str) {
	
		//converting string in lowercase
		str = convertToLower(str);
		
		//creating variable count to indicate count of vowels
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			} 
		}
		//returning the count
		return count;
	}
	//method to count consonant
	public static int countConsonant(String str) {
		//creating variable count to indicate count of consonants
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			//incrementing the count if current character is not a vowel
			if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
				count++;
			} 
		}
		//returning the count
		return count;
	}
}