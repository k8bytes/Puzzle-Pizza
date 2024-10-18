import java.util.Scanner;

public class PentagonAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        // Calculate the side length of the pentagon
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Calculate the area of the pentagon
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f\n", area);
    }
}
