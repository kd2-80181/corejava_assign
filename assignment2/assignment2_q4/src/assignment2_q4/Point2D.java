package assignment2_q4;

public class Point2D {
    private int x;
    private int y;

    // Parameterized constructor to initialize x and y coordinates
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return string form of point's x & y coordinates
    public String getDetails() {
        return "X-coordinate: " + x + ", Y-coordinate: " + y;
    }
}