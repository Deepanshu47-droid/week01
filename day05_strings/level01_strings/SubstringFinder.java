import java.util.Scanner;
public class SubstringFinder {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for string str
		System.out.print("Enter a String : ");
		String str = input.next();
		
		//taking user inputs for starting and ending indexes
		System.out.print("Enter the starting index : ");
		int start = input.nextInt();
		System.out.print("Enter the ending index : ");
		int end = input.nextInt();
		
		//creating variable substringByCharAt to store substring using charAt
		String substringByCharAt = substringUsingCharAt(str, start, end);
		
		//creating variable substringByMethod to store substring using equals method
		String substringByMethod = str.substring(start-1, end-1);
		
		//printing the results
		System.out.println("Substring of " + str + " from index " + start + " to " + end + " is " + substringByCharAt + " using charAt");
		System.out.println("Substring of " + str + " from index " + start + " to " + end + " is " + substringByMethod + " using builtin substring method");
		
		//closing the input
		input.close();
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
}