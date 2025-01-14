import java.util.Scanner;
public class LeapYearByMethod {

	//method to check leap year
	public static void checkLeapYear(int year) {
		
		// Checking if the year is valid (Gregorian calendar starts from 1582)
		if (year >= 1582) {
		
			// Determine if the year is a Leap Year using a single if condition with logical operators
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The year " + year + " is a Leap Year.");
			} else {
				System.out.println("The year " + year + " is not a Leap Year.");
			}
		} else {
			System.out.println("The year " + year + " is not valid. Please enter a year >= 1582.");
		}
	}
	
	public static void main(String[] args) {
		
		// Creating a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Taking user input for the year
		System.out.print("Enter a year (>= 1582): ");
		int year = input.nextInt();
		
		//Checking the given year is leap year or not
		checkLeapYear(year);
		
		// Closing the scanner
		input.close();
	}
}




