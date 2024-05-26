package com.Isanf.incrementSingleThread;

class Counter { 
    private static int count = 0; 

    /** 
     * Increments count in a thread-safe manner. 
     */
    public static synchronized int increment() { 
        count = count + 1; 
        return count; 
    }

    // Method to reset count for testing purposes
    public static synchronized void reset() {
        count = 0;
    }

    // Method to get current count for testing purposes
    public static synchronized int getCount() {
        return count;
    }
}

