import java.util.Scanner;
public class Calculator{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
	
		/*creating variables number1, number2, addition, 
		substraction, multiplication, division*/
		double number1, number2, addition, substraction, multiplication, division;
	
		//taking number1 and number2 as user input
		System.out.print("Enter first number : ");
		number1 = sc.nextDouble();
		
		System.out.print("Enter second number : ");
		number2 = sc.nextDouble();
		
		//adding two numbers
		addition = number1 + number2;
		
		//substracting two numbers
		substraction = number1 - number2;
		
		//multiplying two numbers 
		multiplication = number1 * number2;
		
		//dividing two numbers
		division = number1/number2;
		
		//printing results
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + substraction + ", " + multiplication + ", and " + division);
		
	}
}	

