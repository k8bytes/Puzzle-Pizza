import java.util.Scanner;

public class CostOfDriving {
  public static void main(String[] args) {
    //Create scanner object for user input
    Scanner input = new Scanner(System.in);

    //Prompt user for the distance to drive
    System.out.print("Enter the driving distance: ");
    double distance = input.nextDouble(); 

    //Prompt user for fuel efficiency in miles per gallon 
    System.out.print("Enter miles per gallon: ");
    double milesPerGallon = input.nextDouble();

    //Prompt user for price per gallon
    System.out.print("Enter price per gallon: ");
    double pricePerGallon = input.nextDouble();

    //Calculate cost of driving
    double costOfDriving = (distance / milesPerGallon) * pricePerGallon;

    //Display results
    System.out.printf("The cost of driving is $%.2f", costOfDriving);

    //Close scanner
    input.close();
  }
}