import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
	
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Get input values for the variables
		System.out.print("Enter the first number: ");
		double first = input.nextDouble();
		System.out.print("Enter the second number: ");
		double second = input.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		String op = input.next();
		
		// Perform specific operations based on the input value of the operator
		switch (op) {
			case "+":
				System.out.println("Result: " + (first + second));
				break;
			case "-":
				System.out.println("Result: " + (first - second));
				break;
			case "*":
				System.out.println("Result: " + (first * second));
				break;
			case "/":

				// Handle division by zero
				if (second != 0) {
					System.out.println("Result: " + (first / second));
				}
				else {
					System.out.println("Division by zero is not allowed.");
				}
				break;
			default:
				System.out.println("Invalid operator.");
				break;
		}
		// Close the scanner
		input.close();
	}
}