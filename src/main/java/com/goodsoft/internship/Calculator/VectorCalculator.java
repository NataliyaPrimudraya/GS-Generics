package com.goodsoft.internship.Calculator;

import com.goodsoft.internship.Vector2D;

public class VectorCalculator implements Calculator<Vector2D> {
    /**
     * {@return a vector that is the result of adding two vectors}
     *
     * @param v1 the first vector
     * @param v2 the second vector
     */
    @Override
    public Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    /**
     * {@return a vector that is the result of subtracting two vectors}
     *
     * @param v1 the first vector
     * @param v2 the second vector
     */
    @Override
    public Vector2D substract(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }

    /**
     * {@return a vector obtained by multiplying
     * the first vector by the modulus of the second}
     *
     * @param v1 the first vector
     * @param v2 the second vector
     */
    @Override
    public Vector2D multiply(Vector2D v1, Vector2D v2) {
        double modulus = Math.sqrt(v2.getX() * v2.getX() + v2.getY() * v2.getY());
        return new Vector2D(v1.getX() * modulus, v1.getY() * modulus);
    }

    /**
     * {@return returns a vector obtained by dividing
     * the first vector by the modulus of the second}
     *
     * @param v1 the first vector
     * @param v2 the second vector
     * @throws IllegalArgumentException if modulus
     *                                  of the second vector in null
     */
    @Override
    public Vector2D divide(Vector2D v1, Vector2D v2) {
        double modulus = Math.sqrt(v2.getX() * v2.getX() + v2.getY() * v2.getY());
        if (modulus == 0) {
            throw new IllegalArgumentException("Division by zero occurred.");
        }
        return new Vector2D(v1.getX() / modulus, v1.getY() / modulus);
    }
}
