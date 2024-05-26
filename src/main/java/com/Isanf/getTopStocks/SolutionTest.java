package com.Isanf.getTopStocks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testGetTopStocks() {
        String[] stocks = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};
        float[][] prices = {
            {12.81f, 11.09f, 12.11f, 10.93f, 9.83f, 8.14f},
            {10.34f, 10.56f, 10.14f, 12.17f, 13.10f, 11.22f},
            {11.53f, 10.67f, 10.42f, 11.88f, 11.77f, 10.21f}
        };
        String[] result = Solution.getTopStocks(stocks, prices);
        String[] expected = {"GOOG", "ORLY", "AMZN"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetTopStocksWithDifferentPrices() {
        String[] stocks = {"AAPL", "MSFT", "GOOGL", "TSLA", "FB"};
        float[][] prices = {
            {150.0f, 200.0f, 250.0f, 300.0f, 180.0f},
            {155.0f, 210.0f, 255.0f, 290.0f, 190.0f},
            {160.0f, 220.0f, 260.0f, 280.0f, 200.0f}
        };
        String[] result = Solution.getTopStocks(stocks, prices);
        String[] expected = {"GOOGL", "TSLA", "MSFT"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetTopStocksWithSingleStock() {
        String[] stocks = {"AAPL"};
        float[][] prices = {
            {150.0f},
            {155.0f},
            {160.0f}
        };
        String[] result = Solution.getTopStocks(stocks, prices);
        String[] expected = {"AAPL", null, null};  // Expecting nulls for missing stocks
        assertArrayEquals(expected, result);
    }
}

