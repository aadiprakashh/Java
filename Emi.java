import java.util.*;
public class Emi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Enter loan amount (in lakhs): ");
        double loanAmount = scanner.nextDouble() * 100000; // Convert to rupees

        System.out.print("Enter loan tenure (in months): ");
        int tenure = scanner.nextInt();

        // Option 1: Calculate EMI with user-provided interest rate
        System.out.print("Enter interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();
        double emi = calculateEmi(loanAmount, tenure, interestRate);
        System.out.printf("EMI for %s (%.2f%% interest) is ₹ %.2f\n", carModel, interestRate, emi);

        // Option 2: Calculate EMI with random interest rate (for reference)
        double randomInterestRate = generateRandomInterestRate();
        double randomEmi = calculateEmi(loanAmount, tenure); // Method overloading for random rate
        System.out.printf("EMI for %s (random interest: %.2f%%) is ₹ %.2f (reference only)\n", carModel, randomInterestRate, randomEmi);

        scanner.close();
    }

    // Method overloading for EMI calculation with interest rate
    public static double calculateEmi(double principal, int tenure, double interestRate) {
        double monthlyInterestRate = interestRate / (100 * 12); // Convert to monthly rate
        double emi = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -tenure));
        return emi;
    }

    // Method overloading for EMI calculation with random interest rate (optional)
    public static double calculateEmi(double principal, int tenure) {
        double randomInterestRate = generateRandomInterestRate();
        return calculateEmi(principal, tenure, randomInterestRate); // Call overloaded method with random rate
    }

    public static double generateRandomInterestRate() {
        Random random = new Random();
        return random.nextDouble() * 5 + 8; // Generate random interest rate between 8% and 13%
    }
}
