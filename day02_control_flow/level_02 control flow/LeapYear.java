import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
	
	// Create a Scanner object to take user input
	Scanner input = new Scanner(System.in);

	// Take user input for the year
	System.out.print("Enter a year (>= 1582): ");
	int year = input.nextInt();
	
	// Check if the year is valid (Gregorian calendar starts from 1582)
	if (year >= 1582) {
	
		// Part 1: Using multiple if-else statements
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
				else {
					isLeapYear = false;
				}
			} 
			else {
				isLeapYear = true;
			}
		}
		else {
			isLeapYear = false;
		}
	
		// Output the result using multiple if-else statements
		if (isLeapYear) {
			System.out.println("The year " + year + " is a Leap Year (using if-else).");
		} 
		else {
			System.out.println("The year " + year + " is not a Leap Year (using if-else).");
		}

		// Part 2: Using a single if statement with multiple logical conditions
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The year " + year + " is a Leap Year (using single if).");
		} 
		else {
			System.out.println("The year " + year + " is not a Leap Year (using single if).");
		}
	}	
	else {
		System.out.println("The year " + year + " is not valid. Please enter a year >= 1582.");
	}
	// Close the scanner
	input.close();
	}
}
