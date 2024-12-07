import java.util.Scanner;

public class PE_SumElementsColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter the elements of a 3-by-4 matrix, row by row:");
        System.out.println("Each row should contain 4 numbers separated by spaces (e.g., 1 3 5 7).");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int column = 0; column < matrix[0].length; column++) {
            double sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }
            System.out.println("Sum of the elements at column " + column + " is " + sum);
        }
    }
}