import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // creating Arrays to hold salaries and years of service
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        
        // creating Arrays to hold new salary and bonus amounts
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        // creating Variables to calculate totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the salary for employee " + (i + 1) + ": ");
            double salary = input.nextDouble();

            System.out.println("Enter the years of service for employee " + (i + 1) + ": ");
            double years = input.nextDouble();

            // Validate input
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Salary must be positive and years of service cannot be negative. Try again.");
                i--; // Decrement index to retry for this employee
                continue;
            }

            // Save input into arrays
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculating loop
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            double bonus = salaries[i] * bonusPercentage;
            double newSalary = salaries[i] + bonus;

            // Save calculated values
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            // calculating totals
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

        // Output results
        System.out.println("\nEmployee-wise Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n", 
                              i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }
        
        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
