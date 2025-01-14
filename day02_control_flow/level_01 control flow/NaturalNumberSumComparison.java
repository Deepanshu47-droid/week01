import java.util.Scanner;
public class NaturalNumberSumComparison {
	public static void main(String[] args) {
	
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for the number
		System.out.print("Enter a natural number: ");
		int number = input.nextInt();
		
		// Check if the number is a natural number (greater than 0)
		if (number > 0) {
		
			// Calculate the sum using the formula
			int sumFormula = number * (number + 1) / 2;
		
			// Calculate the sum using a while loop
			int sumWhileLoop = 0;
			int i = 1;
			while (i <= number) {
				sumWhileLoop += i;
				i++;
			}
			
			// Print the results
			System.out.println("The sum of " + number + " natural numbers using the formula is " + sumFormula);
			System.out.println("The sum of " + number + " natural numbers using the while loop is " + sumWhileLoop);
		
			// Compare the results
			if (sumFormula == sumWhileLoop) {
				System.out.println("Both computations are correct.");
			} 
			else {
				System.out.println("There is a difference between the two computations.");
			}
			} 
		else {
			System.out.println("The number " + number + " is not a natural number.");
		}
		// Close the scanner
		input.close();
	}
}
