public class PrintTableTwoEightteen {
  public static void main(String[] args) {
    //Print table header
    System.out.println("a  b  pow(a, b)");

    //Loop to calculate and print values for a and b
    for (int a = 1, b=2; a <= 5; a++, b++) {
      //Calculate a^b
      int result = (int) Math.pow(a, b);

      //Print result
      System.out.println(a + "  " + b + "  " + result);
    }
  }
}