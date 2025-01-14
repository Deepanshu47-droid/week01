import java.util.Scanner;
public class MeanHeight{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		//creating array height to indicate the height of players
		double height[] = new double[11];
		
		/*creating variables sum and mean to indicate sum 
		and mean height of players*/
		double sum = 0, mean;
		
		//taking height of players as user input
		for(int i=0; i<11; i++){
			System.out.print("Enter height of player " + (i+1) + " : ");
			height[i] = input.nextDouble();
		}
		
		//calculating sum of heights
		for(int i=0; i<11; i++){
			sum += height[i];
		}
		
		//calculating mean of heights
		mean = sum/11;
		
		//printing the mean height
		System.out.print("The mean height of players is : " + mean);
		
		//closing input object
		input.close();
	}
}