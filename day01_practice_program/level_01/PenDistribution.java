public class PenDistribution{
	public static void main(String []args){
	
		/*creating variables nop, nos, penOnEach, remainingPens
		to indicate number of pens, no of students, 
		number of pen each student get and remaining pen 
		respectively.*/
		int nop =14, nos = 3, penOnEach, remainingPens;
	
		//calculating pen on each student
		penOnEach = nop / nos;
	
		//calculating remaining number of pens
		remainingPens = nop % nos;
	
		//printing the pen details
		System.out.println("The Pen Per Student is " + penOnEach + " and the remaining pen not distributed is " + remainingPens);
	}
}

