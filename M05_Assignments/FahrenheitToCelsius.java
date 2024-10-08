import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a degree in Fahrenheit
    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    // Convert Fahrenheit to Celsius using floating-point division
    double celsius = (5.0 / 9) * (fahrenheit - 32);

    // Display the result
    System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");

    // Close the scanner
    input.close();
  }
}