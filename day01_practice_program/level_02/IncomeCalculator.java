import java.util.Scanner;
public class IncomeCalculator{
	public static void main(String []args){
	
		Scanner sc=new Scanner(System.in);
		
		/*creating variables salary, bonus and income to indicate 
		individual's salary, bonus and income respectively*/
		double salary, bonus, income;
		
		//taking salary and bonus as input
		System.out.print("Enter your salary: ");
		salary=sc.nextDouble();
		
		System.out.print("Enter your bonus: ");
		bonus=sc.nextDouble();
		
		//calculating the income
		income = salary + bonus;
		
		//printing the income
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
	}
}