import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int originalNumber = scanner.nextInt();

        // Store the original number for comparison later
        int number = originalNumber;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNumber);

        // Check if the original and reversed numbers are equal
        if (originalNumber == reversedNumber) {
            System.out.println("The original number and reversed number are equal.");
        } else {
            System.out.println("The original number and reversed number are not equal.");
        }
        
        scanner.close();
    }
}
