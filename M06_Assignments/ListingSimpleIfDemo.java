import java.util.Scanner;

public class ListingSimpleIfDemo {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    // Check if number is divisible by 5
    if (number % 5 == 0)
      System.out.println("HiFive");

    // Check if number is divisible by 2
    if (number % 2 == 0)
      System.out.println("HiEven");
  }
}