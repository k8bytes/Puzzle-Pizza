import java.util.Scanner;

public class PE_AverageArray {
    // Method to calculate the average for an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length; // Integer division
    }

    // Method to calculate the average for a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 10 double values
        double[] doubleArray = new double[10];
        System.out.println("Enter 10 double values: ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = input.nextDouble();
        }

        // Calculate and display the average
        double average = average(doubleArray);
        System.out.println("The average value is: " + average);
    }
}