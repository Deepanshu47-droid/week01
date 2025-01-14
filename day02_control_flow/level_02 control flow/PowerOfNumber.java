import java.util.Scanner;
public class PowerOfNumber {
	public static void main(String[] args) {

		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the number
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		
		// Take user input for the power
		System.out.print("Enter the power: ");
		int power = input.nextInt();
		
		// Initialize the result variable
		int result = 1;
		// Run a for loop from i = 1 to i <= power
		for (int i = 1; i <= power; i++) {
			// Multiply the result with the number and assign the value to result 
			result *= number;
		}
	
		// Print the result
		System.out.println("The result of " + number + " raised to the power of " + power + " is " + result);
	
		// Close the scanner
		input.close();
	}
}
