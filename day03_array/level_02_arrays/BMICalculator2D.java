import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for height and weight, calculate BMI, and determine weight status
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Input height and validate
            do {
                System.out.print("Enter height (meters): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (personData[i][0] <= 0);

            // Input weight and validate
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store it in the array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nPerson Details:");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println("----------------------------------------------------------");
        }
		//closing input
        input.close();
    }
}
