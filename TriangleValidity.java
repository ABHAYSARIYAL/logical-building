import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three angles of the triangle
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();

        // Check if the sum of the angles is 180 degrees
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        scanner.close();
    }
}
