import java.util.Scanner; 

public class ConvertPoundsToKilograms {
  public static void main(String[] args) {
    //Create scanner object to read input
    Scanner input = new Scanner(System.in);

    //Prompt user for value in pounds
    System.out.print("Enter a weight (value) in pounds: ");
    double pounds = input.nextDouble(); //Reads input and stores it in pounds variable

    //Convert pounds to kilograms (1 pound = 0.454 kilograms)
    double kilograms = pounds * 0.454;

    //Display results
    System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

    //Close scanner
    input.close();
  }
}