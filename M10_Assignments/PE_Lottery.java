import java.util.Scanner;

public class PE_Lottery {
    public static void main(String[] args) {
        // Generate a lottery number with distinct digits
        int lotteryDigit1 = (int)(Math.random() * 10);

        int lotteryDigit2;
        do {
            lotteryDigit2 = (int)(Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);

        int lottery = lotteryDigit1 * 10 + lotteryDigit2;

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryGuessDigit1 = lottery / 10;
        int lotteryGuessDigit2 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if ((guessDigit1 == lotteryGuessDigit2 && guessDigit2 == lotteryGuessDigit1)) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryGuessDigit1 || guessDigit1 == lotteryGuessDigit2
                || guessDigit2 == lotteryGuessDigit1 || guessDigit2 == lotteryGuessDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}