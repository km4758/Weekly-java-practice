import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Read perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculation: Side = Perimeter / 4
        double side = perimeter / 4;

        // Output: Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}


