import java.util.Scanner;
public class CharacterRemover {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for str
		System.out.print("Enter a string : ");
		String str = input.nextLine();
		
		//taking user inputs for 
		System.out.print("Enter a character you want to remove : ");
		char character = input.next().charAt(0);
		
		//creating a variable to store string after removing a specific character
		String result = str.replace(Character.toString(character), "");
		
		//printing the details
		System.out.println("String after removing character " + character + " is " + result);
		
		//closing the input
		input.close();
	}
	
}