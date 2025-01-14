import java.util.Scanner;

public class CalendarDisplay {
    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", 
                            "May", "June", "July", "August", "September", 
                            "October", "November", "December"};
        return months[month];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Checking for leap year condition in February
        if (month == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            return 29;
        } else {
            return days[month];
        }
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // Setting the first day of the month
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        System.out.println(" " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Getting the number of days in the month
        int numberOfDays = getNumberOfDays(month, year);
        // Getting the first day of the month
        int startDay = getFirstDayOfMonth(month, year);

        // Printing spaces for the days before the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("   "); // Each space accounts for a day
        }

        // Printing the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d", day);
            if ((day + startDay) % 7 == 0) {
                // Starting a new line after Saturday
				System.out.println(); 
            }
        }
		// Printing a final newline after the calendar
        System.out.println(); 
    }

    // Main method
    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Taking user input for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        // Displaying the calendar for the given month and year
        displayCalendar(month, year);

        // Closing the scanner object
        input.close();
    }
}
