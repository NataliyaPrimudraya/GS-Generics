package com.goodsoft.internship;

import com.goodsoft.internship.Calculator.VectorCalculator;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1.0, 5.0);
        Vector2D v2 = new Vector2D(2.0, 3.0);
        VectorCalculator vectorCalc = new VectorCalculator();
        System.out.println(vectorCalc.divide(v1, v2));
    }
}