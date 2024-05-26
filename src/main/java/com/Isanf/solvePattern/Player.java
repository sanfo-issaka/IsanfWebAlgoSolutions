package com.Isanf.solvePattern;

import java.util.*;

class Player {
    public static int[] solve(int imageWidth, int imageHeight, String[] image, int patternWidth, int patternHeight, String[] pattern) {
        for (int y = 0; y <= imageHeight - patternHeight; y++) {
            for (int x = 0; x <= imageWidth - patternWidth; x++) {
                boolean match = true;
                for (int i = 0; i < patternHeight; i++) {
                    if (!image[y + i].substring(x, x + patternWidth).equals(pattern[i])) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int imageWidth = in.nextInt();
        int imageHeight = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] image = new String[imageHeight];
        for (int i = 0; i < imageHeight; i++) {
            image[i] = in.nextLine();
        }
        int patternWidth = in.nextInt();
        int patternHeight = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] pattern = new String[patternHeight];
        for (int i = 0; i < patternHeight; i++) {
            pattern[i] = in.nextLine();
        }
        int[] coordinates = solve(imageWidth, imageHeight, image, patternWidth, patternHeight, pattern);
        for (int i = 0; i < 2; i++) {
            System.out.println(coordinates[i]);
        }
    }
}
