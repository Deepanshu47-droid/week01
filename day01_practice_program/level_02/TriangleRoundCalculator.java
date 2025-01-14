import java.util.Scanner;
public class TriangleRoundCalculator{
	public static void main(String []args){
	
		Scanner sc=new Scanner(System.in);
		
		/*creating variables side1, side2, side3, perimeter and 
		numberOfRounds to indicate 3 sides of triangle perimeter 
		and number of round the athelete must complete respectively*/
		double side1, side2, side3;
		int perimeter, numberOfRounds;
		
		//taking first side of triangle as user input
		System.out.print("Enter first side: ");
		side1 = sc.nextDouble();
		
		//taking second side of triangle as user input
		System.out.print("Enter second side: ");
		side2 = sc.nextDouble();
		
		//taking third side of triangle as user input
		System.out.print("Enter third side: ");
		side3 = sc.nextDouble();
		
		//calculating perimeter
		perimeter = (int)(side1 + side2 + side3);
		
		
		//calculating rounds must be completed
		numberOfRounds = 5/perimeter;
		
		//printing results
		System.out.print("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
		
	}
}
