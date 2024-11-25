import java.util.Scanner;

public class PE_ReverseArray {
    // Method to reverse an array
    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Reverse the array
        int[] reversedNumbers = reverse(numbers);

        // Display the reversed array
        System.out.println("The reversed numbers are: ");
        for (int num : reversedNumbers) {
            System.out.print(num + " ");
        }
    }
}