import java.util.Scanner;
public class NaturalNumberSumComparison {
	
	
	//method to calculate sum recursively
	public static int recursiveSum(int n) {
		
		//calculating the sum
		if(n == 1) {
			return 1;
		} else {
			return (n + recursiveSum(n-1));
		}
	}
	
	//method to calculate sum by formula
	public static int sumByFormula(int n) {
		
		// Calculate the sum using the formula
		int sum = n * (n + 1) / 2;
		
		//returning the sum 
		return sum;
	}
	
	
	public static void main(String[] args) {
	
		// Creating a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		//creating variables
		int number, sumRecursive, sumFormula;
		
		// Take user input for the number
		System.out.print("Enter a natural number: ");
		number = input.nextInt();
		
		// Checking if the number is a natural number (greater than 0)
		if (number > 0) {
		
			
			// Calculating the sum using recursive function
			sumRecursive = recursiveSum(number);
			
			//Calculating the sum by formula
			sumFormula = sumByFormula(number);
			
			// Printing the results
			System.out.println("The sum of " + number + " natural numbers using the formula is " + sumFormula);
			System.out.println("The sum of " + number + " natural numbers using recursion " + sumRecursive);
		
			// Comparing the results
			if (sumFormula == sumRecursive) {
				System.out.println("Both computations are correct.");
			} else {
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
