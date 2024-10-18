import java.util.Scanner;

public class RegularPolygonArea {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of sides
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        // Prompt the user to enter the side length
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Compute the area of the polygon
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        // Display the result
        System.out.println("The area of the polygon is " + area);
    }
}
