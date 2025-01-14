import java.util.Scanner;
public class DoubleOperation{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables a, b, c, d and ans1, ans2, ans3, ans4
		to indicate the number 1, number 2, number 3, number 4 and
		result of expressions respectively*/
		double a, b, c, d, ans1, ans2, ans3, ans4;
		
		//taking values of a, b, c and d as user input
		System.out.print("Enter first number : ");
		a = sc.nextDouble();
		
		System.out.print("Enter second number : ");
		b = sc.nextDouble();
		
		System.out.print("Enter third number : ");
		c = sc.nextDouble();
		
		System.out.print("Enter fourth number : ");
		d = sc.nextDouble();
		
		//evaluating the expressions 
		ans1 = a + b *c;
		ans2 = a * b + c;
		ans3 = c + a / b;
		ans4 = a % b + c;
		
		System.out.println("The results of double Operations are " + ans1 + ", " + ans2 + ", " + ans3 + ", " + ans4);
	}
}