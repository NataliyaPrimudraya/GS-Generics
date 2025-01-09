package com.goodsoft.internship.Calculator;

/**
 * Implementation of the Calculator interface
 * for Double class. This class performs simple
 * mathematical operations on objects of the Double class.
 */
public class DoubleCalculator implements Calculator<Double> {

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double substract(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    /**
     * {inheritDoc}
     *
     * @throws ArithmeticException if the divisor in null
     */
    @Override
    public Double divide(Double a, Double b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
