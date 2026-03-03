import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base of the triangle (cm): ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle (cm): ");
        double height = input.nextDouble();

        // 1. Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // 2. Convert area to square inches
        // Since 1 in = 2.54 cm, then 1 sq in = (2.54 * 2.54) sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output the results
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", 
                          areaSqIn, areaSqCm);
        
        input.close();
    }

}
