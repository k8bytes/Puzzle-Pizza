public class AOneTwo {
  public static void main(String[] args) {

    double distanceMiles = 24.0;
    int hours = 1;
    int minutes = 40;
    int seconds = 35;  
  
  double distanceInKilometers = distanceMiles * 1.6;
  
  double totalTimeinHours = hours + (minutes / 60.0) + (seconds / 3600.0);
  
  double speedInKilosPerHour = distanceInKilometers / totalTimeinHours;
  
  System.out.printf("The average speed is %.2f km/h", speedInKilosPerHour); }
}