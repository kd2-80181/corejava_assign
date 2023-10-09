package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of points from user
        System.out.print("Enter number of points: ");
        int numPoints = scanner.nextInt();
        Point2D[] points = new Point2D[numPoints];

        // Input x and y coordinates for each point
        for (int i = 0; i < numPoints; i++) {
            System.out.print("Enter x-coordinate for Point " + (i + 1) + ": ");
            int x = scanner.nextInt();
            System.out.print("Enter y-coordinate for Point " + (i + 1) + ": ");
            int y = scanner.nextInt();
            points[i] = new Point2D(x, y);
        }

        // Menu-driven logic
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Calculate and display distance between two points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index of the point: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < numPoints) {
                        System.out.println(points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!");
                    }
                    break;
                case 2:
                    for (Point2D point : points) {
                        System.out.println(point.getDetails());
                    }
                    break;
                case 3:
                    System.out.print("Enter index of start point: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter index of end point: ");
                    int endIndex = scanner.nextInt();
                    if (startIndex >= 0 && startIndex < numPoints && endIndex >= 0 && endIndex < numPoints) {
                        if (!points[startIndex].isEqual(points[endIndex])) {
                            double distance = points[startIndex].calculateDistance(points[endIndex]);
                            System.out.println("Distance between points: " + distance);
                        } else {
                            System.out.println("Points are located at the same position.");
                        }
                    } else {
                        System.out.println("Invalid indices, please retry!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
