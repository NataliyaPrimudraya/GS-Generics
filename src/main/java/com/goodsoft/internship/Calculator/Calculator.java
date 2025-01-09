package com.goodsoft.internship.Calculator;

/**
 * Interface for simple operations:
 * addition, subtraction, multiplication and division
 *
 * @param <T> the type of elements on which
 *            operations will be performed
 */
public interface Calculator<T> {

    /**
     * {@return the result
     * of adding two elements}
     *
     * @param a the first term
     * @param b the second term
     */
    T add(T a, T b);

    /**
     * {@return the result of
     * subtracting two values}
     *
     * @param a the minuend element
     * @param b the subtracted element
     */
    T substract(T a, T b);

    /**
     * {@return the result of
     * multiplying two values}
     *
     * @param a the first multiplier
     * @param b the second multiplier
     */
    T multiply(T a, T b);

    /**
     * {@return the result of dividing two values}
     *
     * @param a the dividend value
     * @param b the divisor value
     */
    T divide(T a, T b);
}
