import java.util.Scanner;

public class PE_ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store 10 integers
        int[] numbers = new int[10];

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Display the numbers in reverse order
        System.out.println("The numbers in reverse order are: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}