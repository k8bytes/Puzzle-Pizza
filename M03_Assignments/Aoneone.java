public class Aoneone {
  public static void main(String[] args) {

    long currentPopulation = 312032486;

    int secondsPerYear = 365 * 24 * 60 * 60;

    double birthsPerYear = secondsPerYear / 7.0;
    double deathsPerYear = secondsPerYear / 13.0;
    double imigrantsPerYear = secondsPerYear / 45.0;

    double netChangePerYear = birthsPerYear - deathsPerYear + imigrantsPerYear;

    System.out.println("Current population:" + currentPopulation);

    for (int year = 1; year <= 5; year++) {
      currentPopulation += netChangePerYear;
      System.out.println("Year " + year + " projected population: " + currentPopulation);
    }
  }
}