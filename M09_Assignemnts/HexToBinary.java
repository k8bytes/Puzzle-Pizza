import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a hex digit
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine().toUpperCase();

        // Check if the input is valid (single character and a valid hex digit)
        if (hexString.length() == 1 && 
            ((hexString.charAt(0) >= '0' && hexString.charAt(0) <= '9') || 
             (hexString.charAt(0) >= 'A' && hexString.charAt(0) <= 'F'))) {

            // Convert the hex digit to decimal
            int decimalValue = Integer.parseInt(hexString, 16);

            // Convert the decimal value to binary and display the result
            String binaryValue = Integer.toBinaryString(decimalValue);
            System.out.println("The binary value is " + binaryValue);
        } else {
            System.out.println(hexString + " is an invalid input");
        }
    }
}
