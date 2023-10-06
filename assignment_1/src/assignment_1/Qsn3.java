package assignment_1;

import java.util.Scanner;

public class Qsn3 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Food menu with fixed prices
	        String[] menuItems = {
	            "Dosa", "Samosa", "Idli", "Pizza", "Burger",
	            "Pasta", "Noodles", "Biryani", "Ice Cream", "Coffee"
	        };

	        double[] itemPrices = { 5.99, 2.99, 3.49, 7.99, 4.49, 6.99, 5.49, 8.99, 3.99, 2.49 };

	        int[] quantities = new int[menuItems.length];

	        // Displaying food menu
	        System.out.println("Food Menu:");
	        for (int i = 0; i < menuItems.length; i++) {
	            System.out.println((i + 1) + ". " + menuItems[i] + " - $" + itemPrices[i]);
	        }

	        double totalBill = 0;

	        while (true) {
	            System.out.print("Enter your choice (1-10) or 0 to Generate Bill: ");
	            int choice = scanner.nextInt();

	            if (choice >= 1 && choice <= 10) {
	                // User selects an item
	                System.out.print("Enter quantity: ");
	                int quantity = scanner.nextInt();
	                quantities[choice - 1] += quantity;
	            } else if (choice == 0) {
	                // Generate Bill and exit
	                for (int i = 0; i < menuItems.length; i++) {
	                    if (quantities[i] > 0) {
	                        System.out.println(menuItems[i] + " x " + quantities[i] + " - $" + (itemPrices[i] * quantities[i]));
	                        totalBill += itemPrices[i] * quantities[i];
	                    }
	                }
	                System.out.println("Total Bill: $" + totalBill);
	                break;
	            } else {
	                // Invalid choice
	                System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}
