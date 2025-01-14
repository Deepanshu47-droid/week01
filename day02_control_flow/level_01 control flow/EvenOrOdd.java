import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables n and fact indicating the number and factorial and respectively*/
		int n, fact = 1;
		
		//taking user input
		System.out.print("Enter a number :");
		n = sc.nextInt();
		
		//checking input validity
		if(n>0)
		{
			System.out.println("It is natural number.");
			
			//iterating from 1 to n and printing whether number is odd or even
			for(int i=1;i<=n;i++){
				
				if(i%2 == 0)
				{
					System.out.println(i + " is even number.");
				}
				else{
					System.out.println(i + " is odd number.");
				}
			}

		}
		else
		{
			System.out.println("It is negative number.");
			//iterating from -1 to n and printing whether number is odd or even
			for(int i = -1;i>=n;i--){
				
				if(i%2 == 0)
				{
					System.out.println(i + " is even number.");
				}
				else{
					System.out.println(i + " is odd number.");
				}
			}

		}
	}
}