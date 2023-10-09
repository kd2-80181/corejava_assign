package assignment3_q1;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input account information
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter balance at the beginning of the month: ");
        int beginningBalance = scanner.nextInt();
        System.out.print("Enter total of all items charged this month: ");
        int totalCharges = scanner.nextInt();
        System.out.print("Enter total of all credits applied this month: ");
        int totalCredits = scanner.nextInt();
        System.out.print("Enter allowed credit limit: ");
        int creditLimit = scanner.nextInt();

        // Calculate new balance
        int newBalance = beginningBalance + totalCharges - totalCredits;

        // Display new balance
        System.out.println("New balance: " + newBalance);

        // Check if new balance exceeds credit limit
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }

        scanner.close();
    }
}