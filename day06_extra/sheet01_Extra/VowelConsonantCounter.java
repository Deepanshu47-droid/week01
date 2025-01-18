import java.util.Scanner;
public class VowelConsonantCounter {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for string str1
		System.out.print("Enter a String : ");
		String str = input.next();
		
		//creating variable vowel to store count of vowels
		int vowel = countVowel(str);
		//creting variable consonant to store count of consonant
		int consonant = countConsonant(str);
		
		//printing the results
		System.out.println("Number of vowels are " + vowel);
		System.out.println("Number of consonants are " + consonant);
		
		//closing the input
		input.close();
	}
	
	//method to count vowels
	public static int countVowel(String str) {
	
		//creating variable count to indicate count of vowels
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' 
			|| str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			} 
		}
		//returning the count
		return count;
	}
	public static int countConsonant(String str) {
	
		//creating variable count to indicate count of consonants
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			//incrementing the count if current character is not a vowel
			if(!(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' 
			|| str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
				count++;
			} 
		}
		//returning the count
		return count;
	}
					
}