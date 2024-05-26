package com.Isanf.optimalChange;

class Solution { 
    // Do not modify this method signature 
    static Change optimalChange(long s) { 
        if (s < 0 || s % 2 == 1) {
            return null;
        }
        
        Change change = new Change();

        // Start with the largest denomination (10€)
        change.bill10 = s / 10;
        s %= 10;

        // Handle remaining amount with 5€ bills
        change.bill5 = s / 5;
        s %= 5;

        // Handle remaining amount with 2€ coins
        change.coin2 = s / 2;
        s %= 2;

        // If there's any remaining amount that couldn't be handled
        if (s != 0) {
            return null;
        }

        return change;
    }
}
