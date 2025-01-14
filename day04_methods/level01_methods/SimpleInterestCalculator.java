import java.util.Scanner;
public class SimpleInterestCalculator {

	/*method to calculate simple interest taking principal
	rate and time as parameters pr, rate and time respectively*/
	public double simpleInterestCalc( double pr, double rate, double time) {
		
		//creating variable si to indicate simple interest
		double si;
		
		//calculating simple interest
		si = (pr * rate * time) / 100;
		
		//returning the simple interest
		return si;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variables principal, rate and time to 
		indicate principal amount, rate of interest and time*/
		double principal, rate, time;
		
		//taking user input for principal, rate and time
		System.out.print("Enter the principal amount : ");
		principal = input.nextDouble();
		System.out.print("Enter the rate of interest : ");
		rate = input.nextDouble();
		System.out.print("Enter the time : ");
		time = input.nextDouble();
		
		//creating object obj for calling the method
		SimpleInterestCalculator obj = new SimpleInterestCalculator();
		
		/*creating variable si to store simple interest received 
		by calling simpleInterestCalc method*/
		double si = obj.simpleInterestCalc(principal, rate, time);
		
		//printing the simple interest
		System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
		//closing the input object
		input.close();

	}
}		
		
		