import java.util.Scanner;
public class StringReversal {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for string str1
		System.out.print("Enter a String : ");
		String str = input.next();
		
		//creating variable reversedString to store reversed string
		String reversedString = reverseString(str);
		
		//printing the strings
		System.out.println("You entered " + str);
		System.out.println("Reverse of your string is " + reversedString);
		
		
		//closing the input
		input.close();
	}
	//method to reverse a string 
	public static String reverseString(String str) {
		
		//creating charArray array to store characters of string
		char[] charArray = str.toCharArray();
		
		//creating tempArray array to store reversed character array
		char[] tempArray = str.toCharArray();
		
		//reversing the array
		for(int i=0; i<str.length(); i++) {
			tempArray[i] = charArray[(str.length()-1)-i];
		}
		//creating string reversedString to store reversed string
		String reversedString = new String(tempArray);
		
		//returning the reversed string
		return reversedString;
	}
}
	
	
		