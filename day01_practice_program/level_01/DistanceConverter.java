import java.util.Scanner;
public class DistanceConverter{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		//creating variable yard,mile and feet to indicate distance in yard mile and feet 
		double yard, mile, feet;
		
		//taking perimeter as user input
		System.out.print("Enter distance in feet: ");
		feet = sc.nextDouble();
		
		//calculating distance in yards
		yard = feet/3.0;
		
		//calculating distance in miles
		mile=yard/1760.0;
		
		//printing details
		System.out.println(" distance in feet is " + feet + " while in yard is " + yard + " and in miles is " + mile);
	}
}

