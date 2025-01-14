import java.util.Scanner;
public class RocketLaunchCountdown2 {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the countdown start value
		System.out.print("Enter the countdown start value: ");
		int counter = input.nextInt();
		
		// Perform the countdown using a for-loop
		for (int i = counter; i >= 1; i--) {
			// Print the value of the counter
			System.out.println(i);
		
		// Close the scanner
		input.close();
		}
	}
}