import java.util.Scanner;

public class PESumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (ex: 301; 15): ");
        long number = input.nextLong();

        System.out.println("The sum of the digits is " + sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // Extract the last digit and add to sum
            n /= 10; // Remove the last digit
        }
        return sum;
    }
}