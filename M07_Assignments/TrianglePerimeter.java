import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three edges of a triangle
        System.out.print("Enter the first edge of the triangle: ");
        double edge1 = input.nextDouble();
        System.out.print("Enter the second edge of the triangle: ");
        double edge2 = input.nextDouble();
        System.out.print("Enter the third edge of the triangle: ");
        double edge3 = input.nextDouble();

        // Check if the input is valid
        if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1)) {
            // Compute the perimeter
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is " + perimeter);
        } else {
            // Display input is invalid
            System.out.println("Invalid input. The sum of any two edges must be greater than the remaining edge.");
        }
    }
}