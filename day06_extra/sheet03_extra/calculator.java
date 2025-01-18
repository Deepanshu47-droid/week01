import java.util.Scanner;

public class calculator{
	//method to add two numbers
	public static double addition(double a,double b){
		return a+b;
	}
	//method to substract two numbers
	public static double substraction(double a,double b){
		return a-b;
	}
	//method to multiply two numbers
	public static double multiplication(double a,double b){
		return a*b;
	}
	//method to divide two numbers
	public static double division(double a,double b){
		return a/b;
	}
	//method to perform operation of user's choice
	public static void answer(double a,double b){
		
		Scanner input = new Scanner(System.in);

		//taking user's choice (which operation to perform)
		System.out.println("choose an operation:\npress 1 for addition,\n2 for substraction,\n3 for multiplication,\n4 for division ");
		int choice = input.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Addition of two numbers " + a + " and " + b + " is " + addition(a,b));
				break;
			}
			case 2:{
				System.out.println("Substraction of two numbers " + a + " and " + b + " is " + substraction(a,b));
				break;
			}
			case 3:{
				System.out.println("Multiplication of two numbers " + a + " and " + b + " is " + multiplication(a, b));
				break;
			}
			case 4:{
				System.out.println("Division of two numbers " + a + " and " + b + " is " + division(a, b));
				break;
			}
			default:
			System.out.println("wrong choice...");
		}
	}
	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		System.out.println("welcome to calculator");
		
		//taking user input for two numbers a and b
		double a, b;
		System.out.print("Enter 1st number: ");
		a=input.nextDouble();
		System.out.print("Enter 2nd number: ");
		b=input.nextDouble();

		answer(a,b);
		
	}
}