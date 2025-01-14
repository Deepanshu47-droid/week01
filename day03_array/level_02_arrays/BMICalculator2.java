import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        // Arrays to store height, weight, BMI, and status
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Taking input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter height (meters): ");
            heights[i] = input.nextDouble();
            System.out.print("Enter weight (kg): ");
            weights[i] = input.nextDouble();

            // Validating inputs
            if (heights[i] <= 0 || weights[i] <= 0) {
                System.out.println("Invalid input. Try again.");
                i--; // Retry for the current person
                continue;
            }

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            //assigning weight status
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Displaying results
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmis[i]);
            System.out.println("Status: " + statuses[i]);
            System.out.println();
        }

        input.close();
    }
}
