import java.util.Scanner;
public class SpringSeasonEvaluator {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public void springSeason(int month, int day) {
		
		//creating variable numberOfRounds to indicate number Of Rounds
		int numberOfRounds;
		
			// Check if the date falls within the Spring Season
		if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
			System.out.println("It's a Spring Season");
		}
		else {
			System.out.println("Not a Spring Season");
		}
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		// Take user input for the month
		System.out.print("Enter the month (1-12): ");
		int month = input.nextInt();
		
		// Take user input for the day
		System.out.print("Enter the day (1-31): ");
		int day = input.nextInt();
		
		//creating object obj for calling the method
		SpringSeasonEvaluator obj = new SpringSeasonEvaluator();
		
		//calling the method
		obj.springSeason(month, day);
		
		//closing the input object
		input.close();

	}
}		
		
		