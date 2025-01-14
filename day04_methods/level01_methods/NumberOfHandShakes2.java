import java.util.Scanner;
public class NumberOfHandShakes2 {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public int handshakeCalculator( int n) {
		
		//creating variable numberOfHandShakes to indicate numberOfHandshakes
		int numberOfHandShakes;
		
		//calculating number of handshakes
        numberOfHandShakes =  (n * (n - 1)) / 2;
       
		
		//returning the number of handshakes
		return numberOfHandShakes;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		 /*creating variable numberOfPersons and numberOfHandShakes
        to indicate number Of Persons, number Of HandShakes */
        int numberOfPersons, numberOfHandshakes;
       
		
		//taking number of persons as user input
        System.out.print("Enter number of persons : ");
        numberOfPersons = input.nextInt();
		
		//creating object obj for calling the method
		NumberOfHandShakes2 obj = new NumberOfHandShakes2();
		
		//calling the method
		numberOfHandshakes = obj.handshakeCalculator(numberOfPersons);
		
		//printing details
        System.out.println("the number of possible handshakes is " + numberOfHandshakes);
		
		//closing the input object
		input.close();

	}
}		
		
		