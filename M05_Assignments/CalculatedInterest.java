import java.util.Scanner;

public class CalculatedInterest {
  public static void main(String[] args) {
    // Create scanner object for user input
    Scanner input = new Scanner(System.in);

    // Prompt user for the principal amount
    System.out.print("Enter the principal amount: ");
    double principal = input.nextDouble();

    // Prompt user for the interest rate
    System.out.print("Enter the interest rate: ");
    double interestRate = input.nextDouble();

    // Prompt user for the number of years
    System.out.print("Enter the number of years: ");
    int years = input.nextInt();

    // Calculate the interest
    double interest = principal * interestRate * years;

    // Display the result
    System.out.printf("The interest is $%.2f", interest);

    // Close scanner
    input.close();
  }
}
