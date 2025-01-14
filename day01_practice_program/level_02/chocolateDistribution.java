import java.util.Scanner;
public class chocolateDistribution{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variables numberOfchocolate, numberOfChildren,
		chocolateEachChild and remainingchocolates to indicate the 
		number of children, number of children, number of chocolate 
		each child get and remaining chocolate respectively*/
		int numberOfchocolate, numberOfChildren,chocolateEachChild, remainingchocolates;
		
		//taking number of chocolate and number of children as user input
		System.out.print("Enter number of chocolate : ");
		numberOfchocolate = sc.nextInt();
		
		System.out.print("Enter number of children: ");
		numberOfChildren = sc.nextInt();
		
		//calculating number of chocolate each child get
		chocolateEachChild = numberOfchocolate/numberOfChildren;
		
		//calculating remaining chocolates
		remainingchocolates = numberOfchocolate%numberOfChildren;
		
		System.out.println("The number of chocolates each child gets is " + chocolateEachChild + " and the number of remaining chocolates are " + remainingchocolates);
	}
}
