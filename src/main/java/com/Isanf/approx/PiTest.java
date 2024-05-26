package com.Isanf.approx;

import static org.junit.Assert.*;
import org.junit.Test;

public class PiTest {
    @Test
    public void testApproxSmallDataSet() {
        double[][] points = {
            {0.5, 0.5},
            {0.1, 0.1},
            {0.4, 0.3},
            {0.7, 0.7},
            {0.9, 0.9}
        };
        double result = Pi.approx(points);
        assertTrue(result > 0 && result < 4);
    }

    @Test
    public void testApproxLargerDataSet() {
        double[][] points = new double[1000][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = Math.random();
            points[i][1] = Math.random();
        }
        double result = Pi.approx(points);
        assertTrue(result > 3 && result < 3.2); // Expecting a value close to π
    }

    @Test
    public void testApproxBoundary() {
        double[][] points = {
            {0.0, 0.0},
            {1.0, 0.0},
            {0.0, 1.0},
            {0.70710678118, 0.70710678118} // sqrt(2)/2
        };
        double result = Pi.approx(points);
        assertTrue(result > 2 && result < 4); // Check for reasonable estimate
    }
}

