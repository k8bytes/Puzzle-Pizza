import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        // Generate a random integer 0 or 1
        int coinFlip = (int)(Math.random() * 2); // 0 represents heads, 1 represents tails

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the coin flip result (0 for heads, 1 for tails): ");
        int guess = input.nextInt();

        // Check if the guess is correct
        if (guess == coinFlip) {
            System.out.println("Correct! The coin flip result is " + (coinFlip == 0 ? "heads" : "tails") + ".");
        } else {
            System.out.println("Incorrect. The coin flip result is " + (coinFlip == 0 ? "heads" : "tails") + ".");
        }
    }
}