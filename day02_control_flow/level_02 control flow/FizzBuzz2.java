import java.util.Scanner;
public class FizzBuzz2 {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the number
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		// Check if the user has entered a positive integer
		if (number > 0) {
			int i = 0; // Initialize the counter
		
			// Loop from 0 to the entered number using while loop
			while (i <= number) {
					
				// Check for multiples of 3 and 5
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} 
				else if (i % 3 == 0) {
					System.out.println("Fizz");
				}
				else if (i % 5 == 0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
				
				
				// Increment the counter
				i++;
			}
		} 
		else {
			System.out.println("Please enter a positive integer.");
		}
		
		// Close the scanner
		input.close();
	}
}
