import java.util.Scanner;
public class StringComparison {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for string str1
		System.out.print("Enter a String : ");
		String str1 = input.next();
		
		//taking user inputs for string str2
		System.out.print("Enter a String : ");
		String str2 = input.next();
		
		//comparing the strings using charAt
		boolean compareByCharAt = compareUsingCharAt(str1, str2);
		
		//comparing the strings using builtin equals() method
		boolean compareByMethod = str1.equals(str2);
		
		//printing the results
		if(compareByCharAt) {
			System.out.println(str1 + " and " + str2 + " are same on comparing using charAt.");
		} else {
			System.out.println(str1 + " and " + str2 + " are different on comparing using charAt.");
		}
		if(compareByMethod) {
			System.out.println(str1 + " and " + str2 + " are same on comparing using builtin equals method.");
		} else {
			System.out.println(str1 + " and " + str2 + " are different on comparing using builtin equals method.");
		}
		//closing the input
		input.close();
	}
	//method to compare two strings using charAt() 
	public static boolean compareUsingCharAt(String str1, String str2) {
		
		//returning false if length are different
		if(str1.length() != str2.length()) {
			return false;
		}
		
		//returning false if character differ
		for(int i=0; i<str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		//returning true because strings are same
		return true;
	}
}