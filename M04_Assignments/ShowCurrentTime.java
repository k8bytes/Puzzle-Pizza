import java.util.Scanner;

public class ShowCurrentTime {
  public static void main(String[] args) {
    //Create scanner object to read input
    Scanner input = new Scanner(System.in);

    //Prompt user to enter timezone offset to GMT
    System.out.print("Enter the time zone offset to GMT:");
    int timeZoneOffset = input.nextInt();

    //Obtain total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();

    //Obtain total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;

    //Compute current second in the minute in the hour
    long currentSecond = totalSeconds % 60;

    //Obtain total minutes
    long totalMinutes = totalSeconds / 60;

    //Compute the current minute in the hour
    long currentMinut = totalMinutes % 60;

    //Obtain total hours
    long totalHours = totalMinutes / 60;

    //Compute the current hour (adjusted by time zone offset)
    long currentHour = (totalHours + timeZoneOffset) % 24;

    //Display results HH:MM:SS format
    System.out.println("The current time is " + currentHour + ":" + currentMinut + ":" + currentSecond);

    //close scanner 
    input.close();
  }
}