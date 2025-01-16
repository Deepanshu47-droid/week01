import java.lang.Math;
import java.util.Scanner;
public class StudentGradesString {
	public static void main(String[] args) {
	
		//creating scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//creating a variable n to indicate number of students
		System.out.print("Enter number of students : ");
		int n = input.nextInt();
		
		//creating 2d array to store marks of students in 3 subjects
		int marks[][] = generateMarks(n);
		
		//creating array to store percentages of students
		int[] percentages = calculatePercentages(marks);

		//creating array to store total marks of students
		int[] total = calculateTotal(marks);
		
		//creating array to store grades of students
		char[] grades = calculateGrades(percentages);
		
		//printing the details
		System.out.println("Total number of students is " + n);
		System.out.println("Student physics chemistry maths total percentage grade");
		System.out.println("-------------------------------------------------------");
		for(int i=0; i<n; i++) {
			System.out.println(i+1 + "       " + marks[i][0] + "      " + marks[i][1] + "        " + marks[i][2] + "    " + total[i] + "   " + percentages[i] + "         " + grades[i]);
		}
		//closing the input
		input.close();
		
	}
	//method to generate random marks
	public static int[][] generateMarks(int n) {
		
		//creating array marks to indicate the marks of students
		int marks[][] = new int[n][3];
		
		//generating marks of n students
		for(int i=0; i < n; i++){
			//generating random ages
			marks[i][0] = (int)(Math.random()*90) + 10;
			marks[i][1] = (int)(Math.random()*90) + 10;
			marks[i][2] = (int)(Math.random()*90) + 10;

		}
		//returning marks;
		return marks;		
	}
	//method to calculate total marks of students
	public static int[] calculateTotal(int marks[][]) {
		
		//creating array to store total marks of students
		int[] total = new int[marks.length];
		
		//calculating total marks
		for(int i=0; i<marks.length; i++) {
			total[i] = Math.round(marks[i][0] + marks[i][1] + marks[i][2]);
		}
		//returning the total marks
		return total;
	}
	//method to calculate average(percentage) of students
	public static int[] calculatePercentages(int[][] marks) {
		
		
		//creating array to store percentages of students
		int[] percentages = new int[marks.length];
		
		//calculating percentages
		for(int i=0; i<marks.length; i++) {
			percentages[i] = Math.round((marks[i][0] + marks[i][1] + marks[i][2])/3);
		}
		//returning the percentages
		return percentages;
	}
	
	//method to calculate grades of students
	public static char[] calculateGrades(int[] percentages) {
		
		//creating array to store grades of students
		char[] grades = new char[percentages.length];
		
		for(int i=0; i<percentages.length; i++) {
			if(percentages[i] >= 80) {
				grades[i] = 'A';
			} else if(percentages[i] >=70) {
				grades[i] = 'B';
			} else if(percentages[i] >=60) {
				grades[i] = 'C';
			} else if(percentages[i] >=50) {
				grades[i] = 'D';
			} else if(percentages[i] >=40) {
				grades[i] = 'E';
			} else {
				grades[i] = 'R';
			}
		}
		//returning the grades
		return grades;
	}
}
				