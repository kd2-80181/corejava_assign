package com.app.fruits;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fruit[] basket = new Fruit[10];
        int counter = 0;

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of fruits in the basket");
            System.out.println("5. Display details of fresh fruits");
            System.out.println("6. Display tastes of stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits as stale (Optional)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Mango
                    if (counter < basket.length) {
                        System.out.print("Enter weight of Mango: ");
                        double weight = scanner.nextDouble();
                        System.out.print("Enter color of Mango: ");
                        String color = scanner.next();
                        basket[counter++] = new Mango(color, weight);
                        System.out.println("Mango added to the basket.");
                    } else {
                         System.out.println("Basket is full. Cannot add more fruits.");
                    }
                    break;
                case 2:
                    // Add Orange
                    // Similar logic as Mango
                    // ...
                    break;
                case 3:
                    // Add Apple
                    // Similar logic as Mango
                    // ...
                    break;
                case 4:
                    // Display names of fruits in the basket
                    for (int i = 0; i < counter; i++) {
                        System.out.println(basket[i].getName());
                    }
                    break;
                case 5:
                    // Display details of fresh fruits
                    for (int i = 0; i < counter; i++) {
                        if (basket[i].isFresh()) {
                            System.out.println(basket[i]);
                        }
                    }
                    break;
                case 6:
                    // Display tastes of stale fruits
                    for (int i = 0; i < counter; i++) {
                        if (!basket[i].isFresh()) {
                            System.out.println(basket[i].taste());
                        }
                    }
                    break;
                case 7:
                    // Mark a fruit as stale
                    System.out.print("Enter index of the fruit to mark as stale: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < counter) {
                        basket[index].setFresh(false);
                        System.out.println("Fruit marked as stale.");
                    } else {
                        System.out.println("Invalid index. Please try again.");
                    }
                    break;
                case 8:
                    // Mark all sour fruits as stale (Optional)
                    // Similar logic as marking a fruit as stale, but check the taste first
                    // ...
                    break;
                case 0:
                    // Exit
                    System.out.println("Exiting the FruitBasket application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
