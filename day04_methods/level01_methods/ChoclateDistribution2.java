import java.util.Scanner;
public class ChoclateDistribution2 {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public static int[] chocolate(int numberOfchocolate, int numberOfChildren) {
		
		// creating array result to store the quotient and remainder of numbers
		int result[] = new int[2];
		 
		//calculating number of chocolate each child get 
		result[0] = numberOfchocolate/numberOfChildren;
		
		//calculating remaining chocolates
		result[1] = numberOfchocolate%numberOfChildren;
		
		//returning the result
		return result;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		
		/*creating variables numberOfchocolate, numberOfChildren,
		 to indicate the number of chocolate and number of children respectively*/
		int numberOfchocolate, numberOfChildren;
		
		//taking number of chocolate and number of children as user input
		System.out.print("Enter number of chocolate : ");
		numberOfchocolate = input.nextInt();
		
		System.out.print("Enter number of children: ");
		numberOfChildren = input.nextInt();
		
		/* creating array result to store number of chocolate 
		each child get and remaining chocolate*/	
		int result[] = new int[2];
		
		//calling the method
		result = chocolate(numberOfchocolate, numberOfChildren);
		
		//printing details
		System.out.println("The number of chocolates each child gets is " + result[0] + " and the number of remaining chocolates are " + result[1]);

		//closing the input object
		input.close();

	}
}		
		
		