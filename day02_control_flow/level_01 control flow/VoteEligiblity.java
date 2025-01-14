import java.util.Scanner;
public class VoteEligiblity {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the age
		System.out.print("Enter the person's age: ");
		int age = input.nextInt();
		
		// Check if the person's age is greater or equal to 18
		if (age >= 18) {
			System.out.println("The person's age is " + age + " and can vote.");
		} 
		else {
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
		
		// Close the scanner
		input.close();
	}
}
