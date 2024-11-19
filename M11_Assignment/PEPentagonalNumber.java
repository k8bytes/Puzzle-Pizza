public class PEPentagonalNumber {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10; // Display 10 numbers per line
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%-6d", getPentagonalNumber(i));
            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}