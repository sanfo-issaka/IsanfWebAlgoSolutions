package com.Isanf.computeFinalPosition;

import java.io.PrintStream;
import java.util.*;

class Solution { 
    public static int[] computeFinalPosition(int width, int height, int[] position, int[] portalA, int[] portalB, String moves) { 
        int x = position[0];
        int y = position[1];

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    if (y > 0) y--;
                    break;
                case 'D':
                    if (y < height - 1) y++;
                    break;
                case 'L':
                    if (x > 0) x--;
                    break;
                case 'R':
                    if (x < width - 1) x++;
                    break;
            }

            // Check for portal teleportation
            if (x == portalA[0] && y == portalA[1]) {
                x = portalB[0];
                y = portalB[1];
            } else if (x == portalB[0] && y == portalB[1]) {
                x = portalA[0];
                y = portalA[1];
            }
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String moves = in.nextLine();
        int[] position = new int[2];
        for (int i = 0; i < 2; i++) {
            position[i] = in.nextInt();
        }
        int[] portalA = new int[2];
        for (int i = 0; i < 2; i++) {
            portalA[i] = in.nextInt();
        }
        int[] portalB = new int[2];
        for (int i = 0; i < 2; i++) {
            portalB[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int[] finalPosition = computeFinalPosition(width, height, position, portalA, portalB, moves);
        System.setOut(outStream);
        for (int i = 0; i < 2; i++) {
            System.out.println(finalPosition[i]);
        }
    }
}

