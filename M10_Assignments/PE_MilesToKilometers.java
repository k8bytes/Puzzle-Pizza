public class PE_MilesToKilometers {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;

        System.out.printf("%-10s%10s%n", "Miles", "Kilometers");

        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * KILOMETERS_PER_MILE;
            System.out.printf("%-10d%10.3f%n", miles, kilometers);
        }
    }
}