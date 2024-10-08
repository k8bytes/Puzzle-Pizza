import java.util.Scanner;

public class ThreeAdditions {
  public static void main(String[] args) {
    // Generate three random single-digit integers
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int number3 = (int)(Math.random() * 10);

    // Create a Scanner to receive input from the user
    Scanner input = new Scanner(System.in);

    // Prompt the user with the addition question for three numbers
    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");

    // Store the user's answer
    int answer = input.nextInt();

    // Calculate the correct answer
    int correctAnswer = number1 + number2 + number3;

    // Check if the user's answer is correct
    if (answer == correctAnswer) {
      System.out.println("You are correct!");
    } else {
      System.out.println("That is incorrect.\nThe correct answer is " + correctAnswer);
    }

    // Close the scanner
    input.close();
  }
}