import java.util.Scanner;
public class ToogleCase {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for str
		System.out.print("Enter a string : ");
		String str = input.nextLine();
		
		//creating a variable to store string after toogle
		String toogledString = toogleString(str);
		
		//printing the toogled string
		System.out.println("You entered " + str);
		System.out.println("String after toogle is " + toogledString);
		
		//closing the input
		input.close();
	}
	//method to toogle the characters of string
	public static String toogleString(String str) {
		
		//creating charArray array to store characters of string
		char[] charArray = str.toCharArray();
		
		//Toogling the array
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>95) {
			charArray[i] = (char)((int)charArray[i]-32);
			} else {
				charArray[i] = (char)((int)charArray[i]+32);
			}
		}
		//creating string toogledString to store string after toogle
		String toogledString = new String(charArray);
		
		//returning the string
		return toogledString;
	}
}