import java.util.Scanner;

public class RandomMonth {
  public static void main(String[] args) {
    // Brief explanation of the program
    System.out.println("This program randomly selects an integer from 1 to 12 and displays the matching month.");
    System.out.println("1 represents January, 2 represents February, etc.");

// Adding a few line breaks
    System.out.println("\n");

    // Generate a random number between 1 and 12
    int monthNumber = (int)(Math.random() * 12) + 1;

    // Display the corresponding month name
    switch (monthNumber) {
      case 1: 
        System.out.println("The month is January.");
        break;
      case 2: 
        System.out.println("The month is February.");
        break;
      case 3: 
        System.out.println("The month is March.");
        break;
      case 4: 
        System.out.println("The month is April.");
        break;
      case 5: 
        System.out.println("The month is May.");
        break;
      case 6: 
        System.out.println("The month is June.");
        break;
      case 7: 
        System.out.println("The month is July.");
        break;
      case 8: 
        System.out.println("The month is August.");
        break;
      case 9: 
        System.out.println("The month is September.");
        break;
      case 10: 
        System.out.println("The month is October.");
        break;
      case 11: 
        System.out.println("The month is November.");
        break;
      case 12: 
        System.out.println("The month is December.");
        break;
      default:
        System.out.println("Invalid month");
    }
  }
}