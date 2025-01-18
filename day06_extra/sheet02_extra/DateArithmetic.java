import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 1, 1); // Example date input
        LocalDate updatedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("Initial Date: " + inputDate);
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + updatedDate);
        System.out.println("After Subtracting 3 Weeks: " + finalDate);
    }
}
