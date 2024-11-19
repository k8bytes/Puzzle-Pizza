import java.util.Scanner;

public class PEReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (ex: 301; 15): ");
        int number = input.nextInt();

        System.out.print("The reversed integer is ");
        reverse(number);
    }

    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10); // Extract the last digit and print it
            number /= 10; // Remove the last digit
        }
        System.out.println(); // Move to a new line after printing all digits
    }
}