public class CircleDurkel {
  public static void main(String[] args) {
    System.out.println("A circle has a radius of 5.5. Find the perimeter and area of the circle.");

    System.out.println();
    
    double radius = 5.5;
    double pi=Math.PI; 
    double perimeter = 2 * pi * radius;
    double area = pi * radius * radius;

    System.out.println("The perimeter of the circle is: " + perimeter);
    System.out.println("The area of the circle is: " + area);
  }
}