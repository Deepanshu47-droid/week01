import java.util.Scanner;
public class VoteEligibilityArray{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		//creating array age to indicate the age of persons
		int age[] = new int[10];
		
		//taking ages of 10 persons as user input
		for(int i=0; i < 10; i++){
			System.out.print("Enter age of person " + (i+1) + " : ");
			age[i] = input.nextInt();
		}
		
		//printing the voting eligiblity
		for(int i=0; i < 10; i++){
			if( age[i] >= 18 )
			{
				System.out.println(" The student with the age " + age[i] + " can vote.");
			} else
			{
				System.out.println(" The student with the age " + age[i] + " can not vote.");
			}
		}
		//closing input object
		input.close();
		
	}
}