import java.util.Scanner;
public class PriceCalculator{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		/*creating variable unitPrice, quantity and totalPrice
		to indicate unit price, quantity and total price of an item */
		double unitPrice, quantity, totalPrice;
		
		//taking unit price and quantity as user input
		System.out.print("Enter unit price : ");
		unitPrice = sc.nextDouble();
		
		//taking quantity and quantity as user input
		System.out.print("Enter quantity : ");
		quantity = sc.nextDouble();
		
		//calculating total price
		totalPrice = quantity * unitPrice;
		
		//printing the details
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
}

