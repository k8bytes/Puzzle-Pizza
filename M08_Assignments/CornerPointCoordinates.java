import java.util.Scanner;

public class CornerPointCoordinates {
    public static void main(String[] args) {
        // GPS coordinates for the cities (latitude and longitude in degrees)
        double[][] cities = {
                {33.7490, -84.3880},  // Atlanta, GA
                {28.5383, -81.3792},  // Orlando, FL
                {32.0809, -81.0912},  // Savannah, GA
                {35.2271, -80.8431}   // Charlotte, NC
        };

        // Convert degrees to radians
        for (int i = 0; i < cities.length; i++) {
            cities[i][0] = Math.toRadians(cities[i][0]);
            cities[i][1] = Math.toRadians(cities[i][1]);
        }

        // Calculate distances between the cities
        double d1 = distance(cities[0], cities[1]); // Atlanta to Orlando
        double d2 = distance(cities[1], cities[2]); // Orlando to Savannah
        double d3 = distance(cities[2], cities[3]); // Savannah to Charlotte
        double d4 = distance(cities[3], cities[0]); // Charlotte to Atlanta
        double d5 = distance(cities[0], cities[2]); // Atlanta to Savannah

        // Divide the quadrilateral into two triangles and calculate the area
        double area1 = area(d1, d2, d5); // Triangle: Atlanta, Orlando, Savannah
        double area2 = area(d3, d4, d5); // Triangle: Savannah, Charlotte, Atlanta

        // Total area enclosed by the four cities
        double totalArea = area1 + area2;

        System.out.printf("The estimated area enclosed by the four cities is %.2f km^2\n", totalArea);
    }

    // Method to calculate the distance between two GPS coordinates using the Haversine formula
    public static double distance(double[] point1, double[] point2) {
        final double RADIUS = 6371.01; // Earth's radius in km
        double lat1 = point1[0];
        double lon1 = point1[1];
        double lat2 = point2[0];
        double lon2 = point2[1];

        return RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

    // Method to calculate the area of a triangle given its three sides using Heron's formula
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
