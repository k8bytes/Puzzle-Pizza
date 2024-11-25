import java.util.Random;

public class PE_PickFourCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int countPicks = 0; // Count the number of picks
        int targetSum = 24;

        // Initialize the deck (values 1 to 13 for each of the 4 suits)
        for (int i = 0; i < deck.length; i++) {
            deck[i] = (i % 13) + 1; // Values: Ace = 1, King = 13, Queen = 12, Jack = 11, etc.
        }

        Random random = new Random();

        while (true) {
            countPicks++;
            int sum = 0;

            // Pick four random cards
            for (int i = 0; i < 4; i++) {
                int cardIndex = random.nextInt(52); // Random index between 0 and 51
                sum += deck[cardIndex];
            }

            // Check if the sum is 24
            if (sum == targetSum) {
                break;
            }
        }

        // Display the result
        System.out.println("It took " + countPicks + " picks to get a sum of " + targetSum + ".");
    }
}