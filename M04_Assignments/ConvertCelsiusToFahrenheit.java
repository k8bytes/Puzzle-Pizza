import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Celsius temperature
        System.out.print("Enter a temperature in degrees Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the result
        System.out.println(celsius + " Degrees celsius is " + fahrenheit + " Degrees fahrenheit.");
    }
}