package com.Isanf.solvePattern;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void testPatternFound() {
        int imageWidth = 3;
        int imageHeight = 3;
        String[] image = {
            "012",
            "343",
            "012"
        };
        int patternWidth = 1;
        int patternHeight = 1;
        String[] pattern = {
            "0"
        };
        assertArrayEquals(new int[]{0, 0}, Player.solve(imageWidth, imageHeight, image, patternWidth, patternHeight, pattern));
    }

    @Test
    public void testPatternNotFound() {
        int imageWidth = 3;
        int imageHeight = 3;
        String[] image = {
            "012",
            "343",
            "012"
        };
        int patternWidth = 2;
        int patternHeight = 2;
        String[] pattern = {
            "56",
            "78"
        };
        assertArrayEquals(new int[]{-1, -1}, Player.solve(imageWidth, imageHeight, image, patternWidth, patternHeight, pattern));
    }

    @Test
    public void testPatternAtEnd() {
        int imageWidth = 3;
        int imageHeight = 3;
        String[] image = {
            "012",
            "343",
            "012"
        };
        int patternWidth = 2;
        int patternHeight = 1;
        String[] pattern = {
            "12"
        };
        assertArrayEquals(new int[]{1, 0}, Player.solve(imageWidth, imageHeight, image, patternWidth, patternHeight, pattern));
    }

    @Test
    public void testFullPattern() {
        int imageWidth = 3;
        int imageHeight = 3;
        String[] image = {
            "012",
            "343",
            "012"
        };
        int patternWidth = 3;
        int patternHeight = 3;
        String[] pattern = {
            "012",
            "343",
            "012"
        };
        assertArrayEquals(new int[]{0, 0}, Player.solve(imageWidth, imageHeight, image, patternWidth, patternHeight, pattern));
    }

    @Test
    public void testPartialMatch() {
        int imageWidth = 3;
        int imageHeight = 3;
        String[] image = {
            "012",
            "343",
            "012"
        };
        int patternWidth = 2;
        int patternHeight = 2;
        String[] pattern = {
            "01",
            "34"
        };
        assertArrayEquals(new int[]{0, 0}, Player.solve(imageWidth, imageHeight, image, patternWidth, patternHeight, pattern));
    }
}

