import java.util.Scanner;
public class RocketLaunchCountdown {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the countdown start value
		System.out.print("Enter the countdown start value: ");
		int counter = input.nextInt();
		
		// Perform the countdown using a while loop
		while (counter >= 1) {
			// Print the value of the counter
			System.out.println(counter);
			// Decrement the counter
			counter--;
		}
		
		// Close the scanner
		input.close();
	}
}
