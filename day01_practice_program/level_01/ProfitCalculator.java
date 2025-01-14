public class ProfitCalculator{
	public static void main(String []args){
	
		/*creating variables cp, sp, profit and profitPercentage 
		to indicate cost price, selling price, profit, profitPercentage*/ 
		double cp =129, sp = 191, profit, profitPercentage;
		
		//calculating profit
		profit = sp-cp;
		
		//calculating profit percentage
		profitPercentage = profit / cp * 100;
		
		//printing the price and profit details
		System.out.println("The Cost Price is INR " + cp + " and   Selling Price is INR " + sp);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);	
	}
}

