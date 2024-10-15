import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the month and year
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int daysInMonth = 0;
        String monthName = "";

        switch (month) {
            case 1: monthName = "January"; daysInMonth = 31; break;
            case 2: monthName = "February";
                    // Check if it's a leap year
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
            case 3: monthName = "March"; daysInMonth = 31; break;
            case 4: monthName = "April"; daysInMonth = 30; break;
            case 5: monthName = "May"; daysInMonth = 31; break;
            case 6: monthName = "June"; daysInMonth = 30; break;
            case 7: monthName = "July"; daysInMonth = 31; break;
            case 8: monthName = "August"; daysInMonth = 31; break;
            case 9: monthName = "September"; daysInMonth = 30; break;
            case 10: monthName = "October"; daysInMonth = 31; break;
            case 11: monthName = "November"; daysInMonth = 30; break;
            case 12: monthName = "December"; daysInMonth = 31; break;
            default: System.out.println("Invalid month entered."); System.exit(1);
        }

        // Display the number of days in the month
        System.out.println(monthName + " " + year + " had " + daysInMonth + " days.");
    }
}