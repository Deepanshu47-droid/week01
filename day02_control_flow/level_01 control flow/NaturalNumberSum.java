import java.util.Scanner;
public class NaturalNumberSum {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the number
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		// Check if the number is a natural number
		if (number >= 0) {
			
			// Calculate the sum of the first N natural numbers
			int sum = number * (number + 1) / 2;
			
			// Print the result
			System.out.println("The sum of " + number + " natural number is " + sum);
		} 
		else {
		
			// Print that the number is not a natural number
			System.out.println("The number " + number + " is not a natural number");
		}
		
		// Close the scanner
		input.close();
	}
}