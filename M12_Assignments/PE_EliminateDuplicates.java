import java.util.Scanner;
import java.util.ArrayList;

public class PE_EliminateDuplicates {
    // Method to eliminate duplicates
    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> distinctList = new ArrayList<>();

        for (int num : list) {
            if (!distinctList.contains(num)) {
                distinctList.add(num);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 integers
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Eliminate duplicates
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }
}