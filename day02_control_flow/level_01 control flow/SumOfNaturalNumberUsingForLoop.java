import java.util.Scanner;
public class SumOfNaturalNumberUsingForLoop{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables n, sumByFormula and sumByForLoop indicating the number of 
		natural number and sum of n natural numbers by formula and
		for loop respectively*/
		int n, sumByFormula, sumByForLoop = 0;
		
		//taking user input
		System.out.print("Enter a number :");
		n = sc.nextInt();
		
		//checking input validity
		if(n>0)
		{
			System.out.println("It is natural number.");
			//calculating sum by formula
			sumByFormula = n * (n + 1)/2;
		
			//calculating sum by for loop
			for(int i=1;i<=n;i++)
			{
				sumByForLoop += i;
			}
		
			//comparing both answers
			if(sumByFormula == sumByForLoop)
			{
				System.out.println("Both values matched and sum is " + sumByForLoop);
			}
			else
			{
				System.out.println("Both values are mismatched \n sum by formula is " + sumByFormula + " and sum by for loop is " + sumByForLoop );
			}
			}
		else
		{
			System.out.println("It is not a natural number.");
		}
		
		
	}
}