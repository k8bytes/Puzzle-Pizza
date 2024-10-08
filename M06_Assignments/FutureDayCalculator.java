import java.util.Scanner;

public class FutureDayCalculator {
  public static void main(String[] args) {
    // Create a scanner object for input
    Scanner input = new Scanner(System.in);

    // Prompt user to enter the current day
    System.out.print("Enter today's day of the week number (0=Sun, 1=Mon, 2=Tue, 3=Wed, 4=Thu, 5=Fri, 6=Sat): ");
    int today = input.nextInt();

    // Prompt user to enter the number of days elapsed
    System.out.print("Enter the number of days passed since today: ");
    int daysElapsed = input.nextInt();

    // Calculate the future day
    int futureDay = (today + daysElapsed) % 7;

    // Display the current day and the future day
    System.out.print("Today is ");
    switch (today) {
      case 0: System.out.print("Sunday"); break;
      case 1: System.out.print("Monday"); break;
      case 2: System.out.print("Tuesday"); break;
      case 3: System.out.print("Wednesday"); break;
      case 4: System.out.print("Thursday"); break;
      case 5: System.out.print("Friday"); break;
      case 6: System.out.print("Saturday"); break;
      default: System.out.print("Invalid day"); break;
    }

    // Display the number of days passed and the future day
    System.out.print(", so " + daysElapsed + " days from now would be ");
    switch (futureDay) {
      case 0: System.out.println("Sunday."); break;
      case 1: System.out.println("Monday."); break;
      case 2: System.out.println("Tuesday."); break;
      case 3: System.out.println("Wednesday."); break;
      case 4: System.out.println("Thursday."); break;
      case 5: System.out.println("Friday."); break;
      case 6: System.out.println("Saturday."); break;
      default: System.out.println("Invalid day."); break;
    }

    // Close the scanner
    input.close();
  }
}