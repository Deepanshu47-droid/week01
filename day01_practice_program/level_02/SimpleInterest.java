import java.util.Scanner;
public class SimpleInterest{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		/*creating variables principal,rate, time and si to 
		indicate principal amount, rate of interest, time and simple 
		interest respectively*/
		double principal,rate,time,si;
		
		//taking principal, rate and time as input
		System.out.print("Enter principal: ");
		principal=sc.nextDouble();
		System.out.print("Enter rate: ");
		rate=sc.nextDouble();
		System.out.print("Enter height: ");
		time=sc.nextDouble();
		
		//calculating simple interest
		si=(principal*rate*time)/100.0;
		
		//printing the details
		System.out.print("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
	}
}

