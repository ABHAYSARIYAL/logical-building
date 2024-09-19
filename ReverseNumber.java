import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a five-digit number: ");
        int originalNumber = scanner.nextInt();

       
        int number = originalNumber;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNumber);

        // Check if the numbers are equal
        if (originalNumber == reversedNumber) {
            System.out.println("The original number and reversed number are equal.");
        } else {
            System.out.println("The original number and reversed number are not equal.");
        }
        
        scanner.close();
    }
}
