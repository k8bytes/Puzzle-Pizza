import java.util.Scanner;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    // Generate three random single-digit integers
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int number3 = (int)(Math.random() * 10);

    // Create a Scanner object for input
    Scanner input = new Scanner(System.in);

    // Prompt the user for the answer
    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
    int answer = input.nextInt();

    // Check if the answer is correct
    while (number1 + number2 + number3 != answer) {
      System.out.println("Wrong answer. Try again.");
      System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
      answer = input.nextInt();
    }

    // Display result when the answer is correct
    System.out.println("You got it!");

    // Close the scanner
    input.close();
  }
}