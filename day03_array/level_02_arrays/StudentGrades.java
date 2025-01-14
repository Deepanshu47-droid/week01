import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        // Creating arrays to store marks, percentages, and grades of the students
        double[][] marks = new double[number][3];  // marks[0] = Physics, marks[1] = Chemistry, marks[2] = Maths
        double[] percentages = new double[number];
        String[] grades = new String[number];

        // Taking input for marks and calculate percentage and grade
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // taking Input for marks for Physics, Chemistry, and Maths
            for (int j = 0; j < 3; j++) {
                double mark;
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("Enter marks for " + subject + ": ");
                    mark = input.nextDouble();
                    if (mark < 0) {
                        System.out.println("Marks must be positive. Please try again.");
                    }
                } while (marks[i][j] < 0);
                marks[i][j] = mark;
            }

            // Calculating percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Calculating grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Displaying the marks, percentages, and grades for each student
        System.out.println("\nStudent Results:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + "   " + marks[i][0] + "      " + marks[i][1] + "       " 
                               + marks[i][2] + "     " + percentages[i] + "%     " + grades[i]);
        }
		
		//closing the input
        input.close();
    }
}
