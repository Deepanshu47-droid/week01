import java.util.Scanner;

public class HeightComparison3 {

	//method to find youngest of 3 friends
	public static int findYoungest(int[] ages) {
		 
		// Variables to find the youngest
        int youngestIndex = 0;  
        int minAge = ages[0];  

		
		 // Loop through the arrays to find the youngest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {  
				// Check if the current friend is younger
                minAge = ages[i];
                youngestIndex = i;
            }
		}
		
		//returning the youngest index
		return youngestIndex;
	}
	
	//method to find tallest of 3 friends
	public static int findTallest(double[] heights) {
		 
		// Variables to find the tallest 
		int tallestIndex = 0;  
        double maxHeight = heights[0];  
		
		 // Loop through the arrays to find the tallest
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {  
				// Check if the current friend is taller
                maxHeight = heights[i];
                tallestIndex = i;
            }
		}
		
		//returning the youngest index
		return tallestIndex;
	}
		
	
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
		
		//creating variables to indicate youngest and tallest indexes
		int youngestIndex = 0;
		int tallestIndex = 0;  
		
		//calling the findYoungest method to find youngest index
		youngestIndex = findYoungest(ages);
		
		//calling the findYoungest method to find youngest index
		tallestIndex = findTallest(heights);

        // Display the results
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        // Close the input object
        input.close();
    }
}
