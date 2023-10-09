package assignment3_q3;

import java.util.Scanner;

public class DrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input information from the user
        System.out.print("Enter total miles driven per day: ");
        double totalMiles = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: $");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: $");
        double parkingFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: $");
        double tolls = scanner.nextDouble();

        // Calculate daily driving cost
        double costPerDay = (totalMiles / milesPerGallon) * costPerGallon + parkingFees + tolls;

        // Display the calculated cost
        System.out.printf("Your daily driving cost is: $%.2f\n", costPerDay);

        scanner.close();
    }
}
