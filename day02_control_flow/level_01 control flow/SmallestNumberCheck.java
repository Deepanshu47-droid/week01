
import java.util.Scanner;
public class SmallestNumberCheck {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the first number
		System.out.print("Enter the first number (number1): ");
		int number1 = input.nextInt();
		
		// Take user input for the second number
		System.out.print("Enter the second number (number2): ");
		int number2 = input.nextInt();
		
		// Take user input for the third number
		System.out.print("Enter the third number (number3): ");
		int number3 = input.nextInt();
		
		// Check if the first number is the smallest
		boolean isFirstSmallest = (number1 < number2) && (number1 <
		number3);
		
		// Print the result
		System.out.println("Is the first number the smallest? " +
		isFirstSmallest);
		
		// Close the scanner
		input.close();
	}
}