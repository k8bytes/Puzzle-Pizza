public class MInfoMain {
  public static void main(String[] args) {
    System.out.println("A rectangle hasa width of 4.5 and a height of 7.9. Find the perimeter and area of the rectangle.");
    System.out.println();
    double width = 4.5;
    double height = 7.9;
    double perimeter = 2 * (width + height);
    double area = width * height;
    System.out.println("The perimeter of the rectangle is: " + perimeter);
    System.out.println("The area of the rectangle is: " + area);
  }
}