public class AOneThreeBaby {
  public static void main(String[] args){
    double a = 3.4;
    double b = 50.2;
    double c = 2.1;
    double d = 0.55;
    double e = 44.5;
    double f = 5.9;

    double determinant = a * d - b * c;

    if (determinant == 0) {
      System.out.println("The system has no unique solution (determinant is zero).");
      return;
      
    }

  // calculate x and y using Cramer's rule  
  double x = (e * d - b * f) / determinant;
  double y = (a * f - e * c) / determinant;

    // display formulas
    System.out.println("Formulas Used:");
    System.out.println("x = (ed-bf) / (ad-bc)");
    System.out.println("y = (af-ef) / (ad-bc)");

    //results
  System.out.println("solution: x = " + x + ", y = " + y);
  }
}