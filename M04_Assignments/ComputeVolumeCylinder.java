import java.util.Scanner;
public class ComputeVolumeCylinder {
  public static void main(String[] args) {
    // Create a Scanner object for reading input
    Scanner input = new Scanner(System.in);

    // Prompt the user for the radius and length of the cylinder
    System.out.print("Enter the radius of the cylinder: ");
    double radius = input.nextDouble();

    System.out.print("Enter the length of the cylinder : ");
    double length = input.nextDouble();

    // Compute the area of the cylinder
    double area = radius * radius * Math.PI;

    // Compute the volume of the cylinder
    double volume = area * length;

    // Display the area and volume
    System.out.println("The area of the cylinder is: " + area);
    System.out.println("The volume of the cylinder is " + volume);

    // Close the scanner
    input.close();
  }
}
  