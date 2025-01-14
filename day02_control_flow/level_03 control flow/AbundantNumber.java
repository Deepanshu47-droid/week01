import java.util.Scanner;
public class AbundantNumber {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Get an integer input for the number variable
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Initialize the sum variable to 0
		int sum = 0;
		
		// Run a for loop from i = 1 to i < number
		for (int i = 1; i < number; i++) {
			
			// Check if number is divisible by i
			if (number % i == 0) {
				
				// If true, add i to sum
				sum += i;
			}
		}
		// Check if sum is greater than number
		if (sum > number) {
			System.out.println(number + " is an Abundant number.");
		}
		else {
			System.out.println(number + " is not an Abundant number.");
		}
		// Close the scanner
		input.close();
	}
}
