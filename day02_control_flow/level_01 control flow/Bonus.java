import java.util.Scanner;
public class Bonus{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables salary, yearOfService and bonus to indicate
		salary of employee, year of service and bonus amount respectively*/
		double salary, yearOfService, bonus = 0;
		
		//taking salary and year of service as user input
		System.out.print("Enter your salary :");
		salary = sc.nextInt();
		
		System.out.print("Enter year of service :");
		yearOfService = sc.nextInt();
		
		if(yearOfService > 5){
			bonus += salary * 5.0/100.0;
		}
		
		//printing the bonus amount
		System.out.println("Your bonus amount is " + bonus);
	}
}