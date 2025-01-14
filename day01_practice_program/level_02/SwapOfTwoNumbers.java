import java.util.Scanner;
public class SwapOfTwoNumbers{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables number1 and number2 to indicate 
		the first and second number respectively*/
		double number1, number2;
		
		//taking number1 and number2 as user input
		System.out.print("Enter first number : ");
		number1 = sc.nextDouble();
		
		System.out.print("Enter second number : ");
		number2 = sc.nextDouble();
		
		//swapping the numbers
		double temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.print("The swapped numbers are  " + number1 +" and " + number2);
	}
}

