public class PE_LargestRowAndColumn {
    public static void main(String[] args) {
        // Create a 4x4 matrix and fill it with random 0s and 1s
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2); // Randomly assign 0 or 1
            }
        }

        // Print the matrix with brackets
        System.out.println("Generated 4x4 matrix:");
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }

        // Find the row with the most 1s
        int largestRowIndex = 0;
        int maxRowOnes = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowOnes) {
                maxRowOnes = rowCount;
                largestRowIndex = i;
            }
        }

        // Find the column with the most 1s
        int largestColumnIndex = 0;
        int maxColumnOnes = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    columnCount++;
                }
            }
            if (columnCount > maxColumnOnes) {
                maxColumnOnes = columnCount;
                largestColumnIndex = j;
            }
        }

        // Display the results
        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest column index: " + largestColumnIndex);
    }
}