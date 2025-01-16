import java.lang.Math;
public class RandomVoteEligibility {
	public static void main(String []args){
		
		//generating random ages
		int[] ages = generateAges();
		
		//creating 2d array to store ages and vote eligiblity {age, true/false}
		String[][] ageVote = voteEligibility(ages);
		
		//printing the vote eligiblity
		printVoteEligibility(ageVote);
		
	}
	
	//method to generate random ages
	public static int[] generateAges() {
		
		//creating array ages to indicate the ages of persons
		int ages[] = new int[10];
		
		//generating ages of 10 persons 
		for(int i=0; i < 10; i++){
			//generating random ages
			ages[i] = (int)(Math.random()*90) + 10;
		}
		//returning ages
		return ages;	
	}
	//method to check person can vote or not
	public static String[][] voteEligibility(int[] ages) {
	
		//creating the 2d array to store ages and vote eligibility {age, true/false}
		String[][] ageVote = new String[ages.length][2];
		
		//checking the vote eligiblity
		for(int i=0; i < 10; i++){
		
			ageVote[i][0] = Integer.toString(ages[i]);
			
			//validating the age
			if(ages[i]>0) {
				if( ages[i] >= 18 )
				{
					ageVote[i][1] = "true";
				} else {
					ageVote[i][1] = "false";
				}
			} else {
				ageVote[i][1] = "Invalid age";
			}
		}
		//returning the ageVote array
		return ageVote;
	}
	//method to print ages and vote in tabular form
	public static void printVoteEligibility(String[][] ageVote) {
		
		//printing details in tabular form
		System.out.println("Age   Vote Eligiblity");
		System.out.println("----------------------");
		for(int i=0; i<ageVote.length; i++) {
			System.out.println(ageVote[i][0] + "     " + ageVote[i][1]);
		}
	}
}