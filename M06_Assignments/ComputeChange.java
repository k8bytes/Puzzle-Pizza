import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount with updated prompt option 2
    System.out.print("Please enter a monetary amount in dollars and cents (e.g., 11.56 for eleven dollars and fifty-six cents): ");
    double amount = input.nextDouble();

    // Convert the amount to cents
    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount %= 100;

    // Find the number of quarters
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount %= 25;

    // Find the number of dimes
    int numberOfDimes = remainingAmount / 10;
    remainingAmount %= 10;

    // Find the number of nickels
    int numberOfNickels = remainingAmount / 5;
    remainingAmount %= 5;

    // Find the number of pennies
    int numberOfPennies = remainingAmount;

    // Display the results with updated message format
    System.out.println("You have $" + amount + " which consists of:");

    if (numberOfOneDollars > 0) {
      System.out.println(" " + numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar" : " dollars"));
    }

    if (numberOfQuarters > 0) {
      System.out.println(" " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
    }

    if (numberOfDimes > 0) {
      System.out.println(" " + numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes"));
    }

    if (numberOfNickels > 0) {
      System.out.println(" " + numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));
    }

    if (numberOfPennies > 0) {
      System.out.println(" " + numberOfPennies + (numberOfPennies == 1 ? " penny" : " pennies"));
    }

    // Close the scanner
    input.close();
  }
}