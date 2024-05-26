package com.Isanf.approx;

class Pi { 
    /** 
     * Approximate pi using the given points. 
     * 
     * @param pts array of points where each point is represented by a double array [x, y]
     * @return an approximation of π
     */ 
    static double approx(double[][] pts) { 
        int insideCircle = 0;
        for (double[] point : pts) {
            double x = point[0];
            double y = point[1];
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        return 4.0 * insideCircle / pts.length;
    } 
}

