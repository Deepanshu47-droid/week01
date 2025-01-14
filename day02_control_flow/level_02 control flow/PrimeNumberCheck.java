import java.util.Scanner;
public class PrimeNumberCheck {

	public static void main(String[] args) {
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		// Take user input for the number
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		// Initialize the isPrime variable
		boolean isPrime = true;
		// Check if the number is greater than 1
		if (number <= 1) {
			isPrime = false;
		} 
		else {
			// Loop through all the numbers from 2 to the user input number
			for (int i = 2; i < number; i++) {
				// Check if the remainder is zero
				if (number % i == 0) {
					// The number is divisible by some other number, so it's not a prime number
					isPrime = false;
					break;
				}
			}
		}
		// Print if the number is prime
		if (isPrime) {
			System.out.println("The number " + number + " is a prime number.");
		}	
		else {
			System.out.println("The number " + number + " is not a prime number.");
		}
		// Close the scanner
		input.close();
	}
}
