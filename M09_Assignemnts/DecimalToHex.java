import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer between 0 and 15
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        // Check if the input is valid
        if (decimal >= 0 && decimal <= 15) {
            // Convert the decimal to a hex value
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("The hex value is " + hex);
        } else {
            System.out.println(decimal + " is an invalid input");
        }
    }
}
