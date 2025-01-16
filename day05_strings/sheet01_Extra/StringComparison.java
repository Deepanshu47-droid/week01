import java.util.Scanner;
public class StringComparison {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for str1
		System.out.print("Enter a string : ");
		String str1 = input.nextLine();
		
		//taking user inputs for str2
		System.out.print("Enter another string : ");
		String str2 = input.nextLine();
		
		/*creating a variable result to store 
		1 if  str1>str2
		-1 if  str1<str2
		0 if  str1=str2  
		*/
		int result = compareString(str1, str2);
		
		//printing the details
		if(result == 1) {
			System.out.println("String " + str1 + " is greater than " + str2);
		} else if(result == -1) {
			System.out.println("String " + str1 + " is lesser than " + str2);
		} else {
			System.out.println("String " + str1 + " is equal to " + str2);
		}
		//closing the input
		input.close();
	}
	//method to compare two strings 
	public static int compareString(String str1, String str2) {
	
		//comparing the strings
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) > str2.charAt(i)) {
				return 1;
			} else if(str1.charAt(i) < str2.charAt(i)) {
				return -1;
			} 
		}
		return 0;	
	}
}