import java.util.Scanner;
public class DiscountCalculator2{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		/*Creating variables named fee, discountPercent, discount,
		discountedFee to indicate university fee, discount percentage,
		discount, discounted fee respectively.*/
		double fee, discountPercent, discount, discountedFee;
		
		//taking university fee as input from user
		System.out.print("Enter university fee : ");
		fee = sc.nextDouble();
		
		//taking discount percentage as input from user
		System.out.print("Enter university fee : ");
		discountPercent = sc.nextDouble();
		
		//Computing discount
		discount = fee * (100 - discountPercent) / 100;
		
		//computing discounted fee
		discountedFee = fee - discount;
		
		//printing the discount details
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}
