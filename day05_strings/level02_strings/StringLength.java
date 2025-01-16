
import java.util.Scanner;
public class StringLength {
	public static void main(String[] args) {
		
		//creating scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//taking user input for a string
		System.out.print("Enter a string : ");
		String str = input.next();
		
		//creating a variable lengthByMethod to indicate length of string by method
		int lengthByMethod = findLength(str);
		
		//printing details
		System.out.println("Length of string " + str + " is " + lengthByMethod + " without length() method");
		System.out.println("Length of string " + str + " is " + str.length() + " by using length() method");
		
		
		//closing the input
		input.close();
	}
	//method to find length of given string
	public static int findLength(String str) {
		
		//finding the length of string and storing it in len variable
		int len = 0;
		try {
			while(true) {
				str.charAt(len);
				len++;
			}
		} catch (Exception e) {
			//do nothing if string out of index exception arises
		}
		
		//returning the length
		return len;
	}
}
			