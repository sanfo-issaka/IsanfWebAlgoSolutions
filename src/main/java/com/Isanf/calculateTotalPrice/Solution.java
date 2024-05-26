package com.Isanf.calculateTotalPrice;

import java.io.PrintStream;
import java.util.*;

class Solution {
    public static int calculateTotalPrice(int[] prices, int discount) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxPrice = 0;
        int maxIndex = -1;
        
        // Find the most expensive product
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxIndex = i;
            }
        }

        // Calculate the discount on the most expensive product
        double discountedPrice = maxPrice * (1 - discount / 100.0);
        
        // Sum up all prices, replacing the most expensive product with its discounted price
        double totalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == maxIndex) {
                totalPrice += discountedPrice;
            } else {
                totalPrice += prices[i];
            }
        }

        // Return the total price rounded down to the nearest integer
        return (int) Math.floor(totalPrice);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int discount = in.nextInt();
        int n = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int price = calculateTotalPrice(prices, discount);
        System.setOut(outStream);
        System.out.println(price);
    }
}
