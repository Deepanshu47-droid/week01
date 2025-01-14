import java.util.Scanner;
public class WeightConverter{
	public static void main(String []args){
	
		Scanner sc=new Scanner(System.in);
		
		/*creating variables pound and kg to indicate 
		weight in pound and kilogram respectively*/
		double pound, kg;
		
		//taking weight in pound as user input
		System.out.print("Enter your weight in pound: ");
		pound = sc.nextDouble();
		
		//calculating weight in kilogram
		kg = pound * 2.2;
		
		//printing weight in kilogram
		System.out.print("The weight of the person in pound is " + pound + " and in kg is " + kg);
		
	}
}

