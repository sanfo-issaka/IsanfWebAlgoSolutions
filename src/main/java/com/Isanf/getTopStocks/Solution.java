package com.Isanf.getTopStocks;

import java.io.PrintStream;
import java.util.*;

class Solution {
    public static String[] getTopStocks(String[] stocks, float[][] prices) {
        int n = stocks.length;
        Map<String, Float> stockToAveragePrice = new HashMap<>();

        // Calculate the average price for each stock
        for (int j = 0; j < n; j++) {
            float sum = 0;
            for (int i = 0; i < prices.length; i++) {
                sum += prices[i][j];
            }
            float average = sum / prices.length;
            stockToAveragePrice.put(stocks[j], average);
        }

        // Sort stocks by their average price in descending order
        List<Map.Entry<String, Float>> sortedStocks = new ArrayList<>(stockToAveragePrice.entrySet());
        sortedStocks.sort((entry1, entry2) -> Float.compare(entry2.getValue(), entry1.getValue()));

        // Get the top 3 stocks
        String[] topStocks = new String[3];
        for (int i = 0; i < 3; i++) {
            topStocks[i] = sortedStocks.get(i).getKey();
        }

        return topStocks;
    }

    // This main method is for running the code manually, it can be ignored when running JUnit tests
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nbstocks = in.nextInt();
        int nbdays = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] stocks = new String[nbstocks];
        for (int i = 0; i < nbstocks; i++) {
            stocks[i] = in.nextLine();
        }
        float[][] prices = new float[nbdays][nbstocks];
        for (int i = 0; i < nbdays; i++) {
            for (int j = 0; j < nbstocks; j++) {
                prices[i][j] = in.nextFloat();
            }
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        String[] top = getTopStocks(stocks, prices);
        System.setOut(outStream);
        for (int i = 0; i < 3; i++) {
            System.out.println(top[i]);
        }
    }
}

