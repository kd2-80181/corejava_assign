package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept coordinates of two points from the user
        System.out.println("Enter x-coordinate for Point 1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y-coordinate for Point 1: ");
        int y1 = scanner.nextInt();
        System.out.println("Enter x-coordinate for Point 2: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y-coordinate for Point 2: ");
        int y2 = scanner.nextInt();

        // Create points
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display point details
        System.out.println("Details of Point 1: " + p1.getDetails());
        System.out.println("Details of Point 2: " + p2.getDetails());

        // Check if points are equal and display the result
        if (p1.isEqual(p2)) {
            System.out.println("Points are located at the same position.");
        } else {
            // Calculate and display distance between points
            double distance = p1.calculateDistance(p2);
            System.out.println("Points are not located at the same position.");
            System.out.println("Distance between Point 1 and Point 2: " + distance);
        }

        // Close the scanner
        scanner.close();
    }
}