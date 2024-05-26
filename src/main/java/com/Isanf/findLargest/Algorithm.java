package com.Isanf.findLargest;

class Algorithm { 
    /** @return the largest number of the given array */ 
    static int findLargest(int[] numbers) { 
        int largest = numbers[0]; // Initialize the largest number with the first element
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
}

