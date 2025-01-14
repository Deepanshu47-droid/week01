import java.util.Scanner;
public class LeapYear2 {
	public static void main(String[] args) {
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		// Take user input for the year
		System.out.print("Enter a year (>= 1582): ");
		int year = input.nextInt();
		// Check if the year is valid (Gregorian calendar starts from 1582)
		if (year >= 1582) {
		// Determine if the year is a Leap Year using a single if condition with logical operators
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		System.out.println("The year " + year + " is a Leap Year.");
		}
		else {
			System.out.println("The year " + year + " is not a Leap Year.");
		}
		}
		else {
			System.out.println("The year " + year + " is not valid. Please enter a year >= 1582.");
		}
		// Close the scanner
		input.close();
	}
}
