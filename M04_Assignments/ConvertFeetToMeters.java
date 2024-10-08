import java.util.Scanner;

public class ConvertFeetToMeters {
  public static void main(String[] args) {
    //Create a Scanner object for reading input
    Scanner input = new Scanner(System.in);

    //Prompt user for the number in feet
    System.out.print("Enter a value for feet: ");
    double feet = input.nextDouble(); //Read user entered value

    //Conversion factor from feet to meters
    double feetToMeters = 0.305;

    //Calculate results in meters
    double meters = feet * feetToMeters;

    //Display reults
    System.out.println(feet + " feet is equal to " + meters + " meters");

    //Close sanncer
    input.close();
  }
}