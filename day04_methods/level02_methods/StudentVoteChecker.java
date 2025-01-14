
import java.util.Scanner;
public class StudentVoteChecker {
	
	//method to check whether a student can vote or not
	public static boolean canStudentVote(int age) {
		
		//validating input
		if(age > 0) {
			//returning true if student can vote else false
			if(age >= 18) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		//creating Scanner object for taking inputs
		Scanner input = new Scanner(System.in);
		
		//creating array ages to indicate ages of students
		int[] ages = new int[10];
		
		//taking ages of 10 students as user input
		for(int i=0; i<10; i++) {
			
			System.out.print("Enter age of student " + (i+1) + " : ");
			ages[i] = input.nextInt();
		}
		//iterating through all students
		for(int i=0; i<10; i++) {
			
			//calling the method canStudentVote and storing the answer in variable result
			boolean result = canStudentVote(ages[i]);
			
			//printing whether the current student can vote or not
			if(result) {
				System.out.println("Student " + (i+1) + " can vote whose age is " + ages[i]);
			} else {
				System.out.println("Student " + (i+1) + " cannot vote whose age is " + ages[i]);
			}
		}
		
		//closing the input object
		input.close();
	}
}