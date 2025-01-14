import java.util.Scanner;
public class SumUntilZeroNegative {
	public static void main(String[] args) {
	
	// Create a Scanner object to take user input
	Scanner input = new Scanner(System.in);
	
	// Initialize the total variable
	double total = 0.0;
	
	// Infinite while loop
	while (true) {
		
		// Take user input
		System.out.print("Enter a number (enter 0 or a negative number to stop): ");
		double userInput = input.nextDouble();
		
		// Check if the user entered 0 or a negative number
		if (userInput <= 0) {
			break;
		}
		
		// Add the user input to the total
		total += userInput;
	}
	
	// Print the total value
	System.out.println("The total sum is " + total);
	
	// Close the scanner
	input.close();
}
}
