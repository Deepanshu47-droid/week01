import java.util.Scanner;
public class NatureOfNumber{
	public static void main(String[] args) {
	
	// Create a Scanner object to take user input
	Scanner input = new Scanner(System.in);
	
	// Take user input for the number
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	// Check if the number is positive, negative, or zero
	if (number > 0) {
		System.out.println("The number is positive.");
	} 
	else if (number < 0) {
		System.out.println("The number is negative.");
	} 
	else {
		System.out.println("The number is zero.");
	}
	
	// Close the scanner
	input.close();
	}
}