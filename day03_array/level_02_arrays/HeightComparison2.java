import java.util.Scanner;

public class HeightComparison2 {
    public static void main(String[] args) {
        // Initialize Scanner object with the name input
        Scanner input = new Scanner(System.in);

        // Arrays to store the ages and heights of the 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter the height (in cm) of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Variables to find the youngest and tallest
        int youngestIndex = 0;  
        int minAge = ages[0];  

        int tallestIndex = 0;  
        double maxHeight = heights[0];  

        // Loop through the arrays to find the youngest and tallest
        for (int i =1; i < 3; i++) {
            if (ages[i] < minAge) {  
				// Check if the current friend is younger
                minAge = ages[i];
                youngestIndex = i;
            }
            if (heights[i] > maxHeight) {  
				// Check if the current friend is taller
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + minAge + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + maxHeight + " cm.");

        // Close the input object
        input.close();
    }
}
