import java.util.Scanner;
public class RoundCalculator {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public static int roundCalculation ( double side1, double side2, double side3) {
		
		//creating variable numberOfRounds to indicate number Of Rounds
		int numberOfRounds;
		
		//calculating perimeter
		double perimeter = (side1 + side2 + side3);
		
		
		//calculating rounds must be completed
		numberOfRounds = 5/(int)perimeter;
       
		
		//returning the number of handshakes
		return numberOfRounds;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variables side1, side2, side3, perimeter and 
		numberOfRounds to indicate 3 sides of triangle perimeter 
		and number of round the athelete must complete respectively*/
		double side1, side2, side3;
		int numberOfRounds;
       
		//taking first side of triangle as user input
		System.out.print("Enter first side: ");
		side1 = input.nextDouble();
		
		//taking second side of triangle as user input
		System.out.print("Enter second side: ");
		side2 = input.nextDouble();
		
		//taking third side of triangle as user input
		System.out.print("Enter third side: ");
		side3 = input.nextDouble();
		
		//calling the method
		numberOfRounds = roundCalculation(side1, side2, side3);
		
		//printing results
		System.out.print("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
		
		//closing the input object
		input.close();

	}
}		
		
		