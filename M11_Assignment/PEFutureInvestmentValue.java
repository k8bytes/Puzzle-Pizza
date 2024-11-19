import java.util.Scanner;

public class PEFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the investment amount and interest rate
        System.out.print("Enter the amount invested (e.g., 10 for $10): ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate (e.g., 9 for 9%): ");
        double annualInterestRate = input.nextDouble();

        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Display table header
        System.out.printf("%-5s %20s\n", "Years", "Future Value");

        // Display future investment value for years 1 to 30
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-5d %20.2f\n", years, 
                futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}