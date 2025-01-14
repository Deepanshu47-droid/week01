import java.util.Scanner;
	public class SumUntilZero2 {
		public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Initialize the total variable
		double total = 0.0;
		
		// Variable to store the user-entered value
		double userInput;
		
		// Enter the first input
		System.out.print("Enter a number (enter 0 to stop): ");
		userInput = input.nextDouble();
		
		// Loop to continue until the user enters 0
		while (userInput != 0) {

			// Add the user input to the total
			total += userInput;
			
			// The user enter the next input
			System.out.print("Enter a number (enter 0 to stop): ");
			userInput = input.nextDouble();
		}
		
		// Print the total value
		System.out.println("The total sum is " + total);
		
		// Close the scanner
		input.close();
	}
}
