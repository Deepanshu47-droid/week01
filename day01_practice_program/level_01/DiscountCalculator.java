public class DiscountCalculator{
	public static void main(String []args){
		
		/*Creating variables named fee, discountPercent, discount,
		discountedFee to indicate university fee, discount percentage,
		discount, discounted fee respectively.*/
		double fee = 125000, discountPercent = 10, discount, discountedFee;

		//Computing discount
		discount = fee * (100 - discountPercent) / 100;
		
		//computing discounted fee
		discountedFee = fee - discount;
		
		//printing the discount details
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}