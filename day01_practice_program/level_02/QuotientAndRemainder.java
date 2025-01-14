import java.util.Scanner;
public class QuotientAndRemainder{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables number1, number2,quotient and 
		remainder to indicate the number 1, number 2, quotient 
		and remainder respectively*/
		double number1, number2, quotient, remainder;
		
		//taking number1 and number2 as user input
		System.out.print("Enter first number : ");
		number1 = sc.nextDouble();
		
		System.out.print("Enter second number : ");
		number2 = sc.nextDouble();
		
		//calculating quotient
		quotient = number1/number2;
		
		//calculating remainder
		remainder = number1%number2;
		
		System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1+ " and " + number2);
	}
}

