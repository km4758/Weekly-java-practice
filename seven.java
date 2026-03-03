public class seven {
    public static void main(String[] args) {
        double radiusKm = 6378;   // radius of Earth in kilometers
        double pi = Math.PI;  // Volume formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        // Convert cubic kilometers to cubic miles
        // 1 km = 0.621371 miles
        // So, 1 km^3 = (0.621371)^3 miles^3
        double conversionFactor = Math.pow(0.621371, 3);
        double volumeMiles3 = volumeKm3 * conversionFactor;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);}}



