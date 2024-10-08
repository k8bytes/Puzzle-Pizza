public class AvgMiles {
  public static void main(String[] args) {
    double distancekilometers = 14.0;
    int minutes = 45;
    int seconds = 30;

    double distancemiles = distancekilometers / 1.6;
    double timeHours = minutes * 60 + seconds / 3600.0;
    double averageSpeed = distancemiles / timeHours;
    System.out.println("The average speed is: " + averageSpeed  +  " miles per hour");
  }
}