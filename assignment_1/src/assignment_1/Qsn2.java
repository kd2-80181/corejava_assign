package assignment_1;

import java.util.Scanner;

public class Qsn2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        // Check if the input is a double
        if (scanner.hasNextDouble()) {
            double num1 = scanner.nextDouble();
            System.out.print("Enter second double value: ");
            // Check if the second input is also a double
            if (scanner.hasNextDouble()) {
                double num2 = scanner.nextDouble();
                // Calculate and print the average
                double average = (num1 + num2) / 2;
                System.out.println("Average of the two numbers: " + average);
            } else {
                // Display error message if the second input is not a double
                System.out.println("Error: Second input is not a double value.");
            }
        } else {
            // Display error message if the first input is not a double
            System.out.println("Error: First input is not a double value.");
        }

        // Close the scanner
        scanner.close();
    }
}
