package com.goodsoft.internship;

/**
 * Two-dimensional vector class.
 * Fields of this class contain
 * x-y coordinates of the vector
 */
public class Vector2D {
    //** x coordinate */
    private double x;
    //** y coordinate */
    private double y;

    /**
     * Constructs a vector with coordinates (x, y)
     *
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * {@return x-coordinate}
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x-coordinate value
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * {@return y-coordinate}
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y-coordinate value
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * {@return the coordinates of a vector in string format (x, y)}
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
