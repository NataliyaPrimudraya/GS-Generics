package com.goodsoft.internship.Calculator;

/**
 * Implementation of the Calculator interface
 * for Integer class. This class performs simple
 * mathematical operations on objects of the Integer class.
 */
public class IntegerCalculator implements Calculator<Integer> {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer substract(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    /**
     * {inheritDoc}
     *
     * @throws ArithmeticException if the divisor in null
     */
    @Override
    public Integer divide(Integer a, Integer b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
