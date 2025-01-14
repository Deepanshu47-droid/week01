import java.util.Scanner;
public class NumberTable{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variable n indicating the number*/
		int n;
		
		//taking user input
		System.out.print("Enter a number :");
		n = sc.nextInt();
		
		for(int i=6;i<=9;i++)
		{
			System.out.println(n + " * " + i + " = " + n*i );
		}			
	}
}