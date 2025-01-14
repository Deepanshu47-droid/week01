import java.util.Scanner;
public class HeightConverter{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		/*creating variables cm, feet, inch to indicate 
		height in centimeter, feet and inches*/
		double cm, feet, inch;
		
		//taking height in cm as user input
		System.out.print("Enter height : ");
		cm = sc.nextDouble();
		
		//calculating height in feet 
		feet=(cm/2.54)/12;
		
		//calculating height in inches
		inch = cm/2.54;
		
		//printing height details
		System.out.print("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inch);
	}
}

