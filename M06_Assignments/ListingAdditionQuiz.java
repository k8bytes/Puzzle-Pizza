import java.util.Scanner;

public class ListingAdditionQuiz {
  public static void main(String[] args) {
    // Generate two random single-digit integers
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 7 % 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user with the addition question
    System.out.print("What is " + number1 + " + " + number2 + "? ");

    // Store the user's input
    int answer = input.nextInt();

    // Display the result
    System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
  }
}