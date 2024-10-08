import java.util.Scanner;

public class MoneyUnitsFA {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Receive the amount as integer (e.g., 1156 for 11 dollars and 56 cents)
        System.out.print("Enter an amount as an integer, for example, 1156 for $11.56: ");
        int amount = input.nextInt();

        // Find the number of dollars
        int numberOfOneDollars = amount / 100;
        int remainingAmount = amount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;  // Corrected the typo here

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of:");
        System.out.println("    " + numberOfOneDollars + " dollars");  // Fixed the variable name
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");

        // Close scanner
        input.close();
    }
}