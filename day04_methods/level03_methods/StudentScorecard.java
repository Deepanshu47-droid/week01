import java.util.Scanner;

public class StudentScorecard {
    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int numStudents) {
        // Creating a 2D array to store scores
        int[][] scores = new int[numStudents][3];
        // Looping through each student to generate random scores of PCM
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10; // Generating random score between 10 and 99
            }
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        // Calculating the size of score array
        int numStudents = scores.length;
        // Creating a 2D array to store results
        double[][] results = new double[numStudents][3];
        // Looping through each student to calculate total, average, and percentage
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        // Looping through each student to display the scorecard
        for (int i = 0; i < scores.length; i++) {
            // Displaying student number
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                // Displaying student marks of PCM
                System.out.print(scores[i][j] + "\t");
            }
            // Displaying student results of total, average, and percentage
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner input = new Scanner(System.in);
        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        // Generating random scores for PCM
        int[][] scores = generateScores(numStudents);
        // Calculating total, average, and percentage
        double[][] results = calculateResults(scores);
        // Displaying the scorecard
        displayScorecard(scores, results);
        // Closing the Scanner object
        input.close();
    }
}
