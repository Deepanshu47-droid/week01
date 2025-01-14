import java.util.Scanner;
public class GreatestFactor {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the number
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Initialize the greatestFactor variable
		int greatestFactor = 1;
		
		// Loop from the last but one till 1
		for (int i = number - 1; i >= 1; i--) {
			
			// Check if the number is perfectly divisible by i
			if (number % i == 0) {
				greatestFactor = i;
				break;
			}
		}
		// Print the greatest factor
		System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
		// Close the scanner
		input.close();
	}
}