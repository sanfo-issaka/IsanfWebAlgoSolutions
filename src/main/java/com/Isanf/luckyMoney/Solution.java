package com.Isanf.luckyMoney;

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public static int luckyMoney(int money, int giftees) {
        if (money < giftees) {
            // Not enough money to give each child at least 1 dollar
            return 0;
        }
        
        // Initial distribution to ensure each child gets at least 1 dollar
        money -= giftees;
        
        // Now maximize the number of 8-dollar gifts
        int countOfEights = Math.min(money / 7, giftees); // We can give at most giftees number of 8-dollar gifts
        money -= countOfEights * 7; // Distributing the remaining money after ensuring max 8-dollar gifts
        
        if (money >= giftees) {
            // Each child can get at least 1 dollar from the remaining money
            return countOfEights;
        } else {
            return 0; // If the remaining money cannot be distributed properly
        }
    }
    
    /* Ignore and do not change the code below */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int giftees = in.nextInt();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int gifts = luckyMoney(money, giftees);
        System.setOut(outStream);
        System.out.println(gifts);
    }
    /* Ignore and do not change the code above */
}
