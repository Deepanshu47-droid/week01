import java.util.Scanner;
public class IntOperation{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables a, b, c, d and ans1, ans2, ans3, ans4
		to indicate the number 1, number 2, number 3, number 4 and
		result of expressions respectively*/
		int a, b, c, d, ans1, ans2, ans3, ans4;
		
		//taking values of a, b, c and d as user input
		System.out.print("Enter first number : ");
		a = sc.nextInt();
		
		System.out.print("Enter second number : ");
		b = sc.nextInt();
		
		System.out.print("Enter third number : ");
		c = sc.nextInt();
		
		System.out.print("Enter fourth number : ");
		d = sc.nextInt();
		
		//evaluating the expressions 
		ans1 = a + b *c;
		ans2 = a * b + c;
		ans3 = c + a / b;
		ans4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + ans1 + ", " + ans2 + ", " + ans3 + ", " + ans4);
	}
}

