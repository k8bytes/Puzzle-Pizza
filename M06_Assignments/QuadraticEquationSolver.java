import java.util.Scanner;

public class QuadraticEquationSolver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt user for input values
    System.out.print("Enter a: ");
    double a = input.nextDouble();

    System.out.print("Enter b: ");
    double b = input.nextDouble();  

    System.out.print("Enter c: ");
    double c = input.nextDouble();

    // Calculate discriminant
    double discriminant = Math.pow(b, 2) - 4 * a * c;

    // Determine the number of roots based on the discriminant
    if (discriminant > 0) {
      // Two real roots
      double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println("The equation has two roots " + root1 + " and " + root2);
    } else if (discriminant == 0) {
      // One real root
      double root = -b / (2 * a);
      System.out.println("The equation has one root " + root);
    } else {
      // No real roots
      System.out.println("The equation has no real roots");
    }

    // Close the scanner
    input.close();
  }
}