import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generating 10 OTPs and store them in an array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Displaying the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Checking if all OTPs are unique
        boolean areUnique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + (areUnique ? "Yes" : "No"));
    }

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otpArray) {
            if (!uniqueOTPs.add(otp)) {
                // If adding to the set fails, it means the OTP is not unique
                return false;
            }
        }
        return true;
    }
}
