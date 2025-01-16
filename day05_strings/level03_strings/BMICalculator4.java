import java.util.Scanner;

public class BMICalculator4 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // creating Array detail to store height (1st column), weight (2nd column), BMI (3rd column)
        double[][] details = new double[10][3];
        
		//creating Array to store status
        String[] statuses = new String[10];

        // Taking input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter height (meters): ");
            details[i][0] = input.nextDouble();
            System.out.print("Enter weight (kg): ");
            details[i][1] = input.nextDouble();

            // Validating inputs
            if (details[i][0] <= 0 || details[i][1] <= 0) {
                System.out.println("Invalid input. Try again.");
                i--; // Retrying for the current person
                continue;
            }

        }
		
		//iterating through the details to calculate BMI's and assigning statuses
		for(int i=0; i<10; i++) {
			
			//calling the method calculateBMI to calculate BMI
			details[i][2] = calculateBMI(details[i][0], details[i][1]);
			
			//calling the method assignStatus to assign status
			statuses[i] = assignStatus(details[i][2]);
		}

        // Displaying results
        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + details[i][0] + " meters");
            System.out.println("Weight: " + details[i][1] + " kg");
            System.out.println("BMI: " + details[i][2]);
            System.out.println("Status: " + statuses[i]);
           
        }
		
		//closing the input object
        input.close();
    }

	//method to calculate BMI
	public static double calculateBMI(double height, double weight) {
		
		//variable to indicate BMI
		double BMI;
		
		// Calculating BMI
        BMI = weight / (height * height);
		
		//returning the BMI
		return BMI;
	}
	
	//method to assign weight status
	public static String assignStatus(double BMI) {
		
		//variable to indicate status
		String status;
		
		//assigning weight status
        if (BMI <= 18.4) {
            status = "Underweight";
        } else if (BMI <= 24.9) {
			status = "Normal";
        } else if (BMI <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
		
		//returning the status
		return status;
	}

}
