import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Prompt the user to enter a month (first three letters)
        System.out.print("Enter a month: ");
        String month = input.next().substring(0, 3);

        // Check the number of days in the month
        switch (month) {
            case "Jan": case "Mar": case "May": case "Jul": case "Aug": case "Oct": case "Dec":
                System.out.println(month + " " + year + " has 31 days");
                break;
            case "Apr": case "Jun": case "Sep": case "Nov":
                System.out.println(month + " " + year + " has 30 days");
                break;
            case "Feb":
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Feb " + year + " has 29 days");
                } else {
                    System.out.println("Feb " + year + " has 28 days");
                }
                break;
            default:
                System.out.println("Invalid month input");
        }
    }
}

