import java.util.Scanner;
public class FactorialByForLoop{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables n and fact indicating the number and factorial and respectively*/
		int n, fact = 1;
		
		//taking user input
		System.out.print("Enter a number :");
		n = sc.nextInt();
		
		//checking input validity
		if(n>=0)
		{
			System.out.println("It is positive number.");
			
			//calculating factorial
			if(n == 0){
				fact = 1;
			}
			else{
				for(int i=1;i<=n;i++){
					fact *= i;
				}
			}
			
			//printing the factorial
			System.out.println("factorial of " + n + " is " + fact);
			
		}
		else
		{
			System.out.println("It is negative number.");
		}
	}
}