import java.util.Scanner;

public class PhysicisFindingRunaway {
  public static void main(String[] args) {
    //Create scanner object to read input from user
    Scanner input = new Scanner(System.in);

    //Prompt user to enter take-off speed (velocity) in meters/second
    System.out.print("Enter value for take-off speed (velocity)(m/s) - as decimal: ");
    double speed = input.nextDouble(); //Read user input as a double

    //Prompt user to enter acceleration (a) in meters/second^2
    System.out.print("Enter value for acceleration (a) (m/s^2) - as decimal: ");
    double acceleration = input.nextDouble(); //Read users input as a double

    //Cacluate minimum runway length using formula length = v^2 / 2a
    double runwayLength = (speed * speed) / (2 * acceleration);

    //Display results
    System.out.println("The minimum runway length needed for this airplane is " + runwayLength + " meters.");

    //Close scanner
    input.close();
  }
}