import java.util.Scanner;
public class CharacterExtractor {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for string str
		System.out.print("Enter a String : ");
		String str = input.next();
		
		//creating array charArray1 to store characters of string using charAt
		char[] charArray1 = findCharacters(str);
		
		//creating array charArray2 to store characters of string using toCharArray Method
		char[] charArray2 = str.toCharArray();
		
		//printing the results
		System.out.println("Characters of " + str + " using charAt are :");
		for(int i=0;i<charArray1.length; i++) {
			System.out.print(" " + charArray1[i]);
		}
		System.out.println("\nCharacters of " + str + " using toCharArray Method are : ");
		for(int i=0;i<charArray1.length; i++) {
			System.out.print(" " + charArray2[i]);
		}
		//closing the input
		input.close();
	}
	//method to find characters of string using charAt() 
	public static char[] findCharacters(String str) {

		//creating charArray array to store character array of character of string
		char[] charArray = new char[str.length()];
		
		//extracting characters from string
		for(int i=0; i<str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		//returning the substring
		return charArray;
	}
}