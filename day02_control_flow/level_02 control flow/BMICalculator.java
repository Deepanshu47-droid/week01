import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for weight in kg
		System.out.print("Enter weight in kg: ");
		double weight = input.nextDouble();
		
		// Take user input for height in cm
		System.out.print("Enter height in cm: ");
		double heightCm = input.nextDouble();
		
		// Convert height from cm to meters
		double heightM = heightCm / 100;
		
		// Calculate BMI
		double bmi = weight / (heightM * heightM);
		
		// Check weight status based on BMI
		String status;
		if (bmi <= 18.4) {
			status = "Underweight";
		}
		else if (bmi <= 24.9) {
			status = "Normal";
		}
		else if (bmi <= 39.9) {
			status = "Overweight";
		}
		else {
			status = "Obese";
		}
		// Print the BMI and weight status
		System.out.println("BMI: " + bmi);
		System.out.println("Status: " + status);
		// Close the scanner
		input.close();
	}
}
