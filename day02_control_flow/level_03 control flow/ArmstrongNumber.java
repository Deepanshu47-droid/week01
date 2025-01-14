import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
	
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Get integer input and store it in the number variable
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Initialize sum variable to zero and originalNumber variable to the input number
		int sum = 0;
		int originalNumber = number;
		
		// Use while loop till originalNumber is not equal to zero
		while (originalNumber != 0) {
			
			// Find the remainder (last digit) using the modulus operator
			int remainder = originalNumber % 10;
			
			// Find the cube of the remainder and add it to the sum variable
			sum += remainder * remainder * remainder;
			
			// Find the quotient of the number and assign it to originalNumber (remove the last digit)
			originalNumber /= 10;
		}
		
		// Check if the original number and the sum are the same
		if (sum == number) {
			System.out.println(number + " is an Armstrong number.");
		}
		else {
		System.out.println(number + " is not an Armstrong number.");
		}
		// Close the scanner
		input.close();
	}
}