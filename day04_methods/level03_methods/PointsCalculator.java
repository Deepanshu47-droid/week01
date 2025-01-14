import java.util.Scanner;

public class PointsCalculator {
	// Main method
    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the coordinates of the two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculating the Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculating the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + " * x + " + lineEquation[1]);

        // Closing the scanner object
        input.close();
    }
    // Method to find the Euclidean distance between two points
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Calculating the distance using the formula
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to find the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculating the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        // Calculating the y-intercept (b)
        double b = y1 - (m * x1);
        // Returning an array with the slope and y-intercept
        return new double[]{m, b};
    }
}
