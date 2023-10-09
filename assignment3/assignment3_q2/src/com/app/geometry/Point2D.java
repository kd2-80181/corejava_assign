package com.app.geometry;

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

    // Method to check if two points have the same coordinates
    public boolean isEqual(Point2D otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    // Method to calculate distance between two points using distance formula
    public double calculateDistance(Point2D otherPoint) {
        int xDiff = this.x - otherPoint.x;
        int yDiff = this.y - otherPoint.y;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }
}
