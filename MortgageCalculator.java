import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate (percent): ");
        double annualRate = scanner.nextDouble();
        System.out.print("Enter loan term (years): ");
        int years = scanner.nextInt();
        scanner.close();

        double monthlyRate = (annualRate / 100) / 12;
        int months = years * 12;
        double monthlyPayment;

        if (monthlyRate == 0) {
            monthlyPayment = loanAmount / months;
        } else {
            monthlyPayment = loanAmount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
        }

        System.out.printf("Monthly payment: %.2f%n", monthlyPayment);
    }
}
