import java.util.Scanner;
public class StringTrimmer {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for string str
		System.out.print("Enter a String : ");
		String str = input.next();
		
		//creating variable trimmedString to store the trimmed string
		String trimmedString = trimUsingCharAt(str);
		
		//printing the trimmed string
		System.out.println("The string without leading and trailing zeroes is " + trimmedString);

		//taking user inputs for starting and ending indexes
		System.out.print("Enter the starting index : ");
		int start = input.nextInt();
		System.out.print("Enter the ending index : ");
		int end = input.nextInt();
		
		//creating variable substring to store substring using equals method
		String substring = substringUsingCharAt(str, start, end);
		
		//printing the substring
		System.out.println("Substring of " + str + " from index " + start + " to " + end + " is " + substring + " using charAt");
		
		//taking two string for comparison
		System.out.print("Enter another string for comparison : ");
		String anotherStr = input.next();
		
		//comparing the strings using charAt
		boolean compareByCharAt = compareUsingCharAt(str, anotherStr);
		
		//printing the comparison
		if(compareByCharAt) {
			System.out.println(str + " and " + anotherStr + " are same on comparing using charAt.");
		} else {
			System.out.println(str + " and " + anotherStr + " are different on comparing using charAt.");
		}
	
		//closing the input
		input.close();
	}
	
	//method to trim leading and trailing spaces
	public static String trimUsingCharAt(String str) {
		
		//creating two variables to indicate the starting and ending point of string
		int start = 0;
		int end = str.length()-1;
		
		//updating the start to remove leading spaces
		while(str.charAt(start) == ' ') {
			start++;
		}
		//updating the end to remove trailing spaces
		while(str.charAt(end) == ' ') {
			end--;
		}
		
		//returning the trimmed string
		return substringUsingCharAt(str, start+1, end+2);
	}
		
	//method to find substring using charAt() 
	public static String substringUsingCharAt(String str, int start, int end) {

		//creating tempArray array to store character array of character of substring
		char[] tempArray = new char[end - start+1];
		
		//extracting characters from string
		for(int i=start-1; i<end-1; i++) {
			tempArray[i-start+1] = str.charAt(i);
		}
		//creating string subString to store substring
		String subString = new String(tempArray);
		
		//returning the substring
		return subString;
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