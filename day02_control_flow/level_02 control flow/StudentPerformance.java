import java.util.Scanner;
public class StudentPerformance {
	public static void main(String[] args) {
	
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input for marks in three subjects
		System.out.print("Enter marks for Physics: ");
		int physics = input.nextInt();
		System.out.print("Enter marks for Chemistry: ");
		int chemistry = input.nextInt();
		System.out.print("Enter marks for Maths: ");
		int maths = input.nextInt();
		
		// Calculate the total and percentage
		int total = physics + chemistry + maths;
		double percentage = total / 3.0;
		// Determine the grade and remarks
		char grade;
		String remarks;
		if (percentage >= 80) {
			grade = 'A';
			remarks = "Level 4, above agency-normalized standards";
		} 
		else if (percentage >= 70) {
			grade = 'B';
			remarks = "Level 3, at agency-normalized standards";
		} 
		else if (percentage >= 60) {
			grade = 'C';
			remarks = "Level 2, below, but approaching agency-normalized standards";
		} 
		else if (percentage >= 50) {
			grade = 'D';
			remarks = "Level 1, well below agency-normalized standards";
		} 
		else if (percentage >= 40) {
			grade = 'E';
			remarks = "Level 1-, too below agency-normalized standards";
		} 
		else {
			grade = 'R';
			remarks = "Remedial standards";
		}
		
		// Print the results
		System.out.println("Average Mark: " + percentage);
		System.out.println("Grade: " + grade);
		System.out.println("Remarks: " + remarks);
		// Close the scanner
		input.close();
	}
}
