public class PE_MilesKilometersConversion {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;

        System.out.printf("%-10s%12s   |   %-12s%10s%n", "Miles", "Kilometers", "Kilometers", "Miles");

        int miles = 1;
        int kilometers = 20;

        while (miles <= 10 && kilometers <= 65) {
            double milesToKilometers = miles * KILOMETERS_PER_MILE;
            double kilometersToMiles = kilometers / KILOMETERS_PER_MILE;

            System.out.printf("%-10d%12.3f   |   %-12d%10.3f%n", miles, milesToKilometers, kilometers, kilometersToMiles);

            miles++;
            kilometers += 5;
        }
    }
}