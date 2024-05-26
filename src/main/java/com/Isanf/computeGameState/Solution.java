package com.Isanf.computeGameState;

import java.io.PrintStream;
import java.util.Scanner;

class Solution {
    public static String computeGameState(String nameP1, String nameP2, String[] wins) {
        int scoreP1 = 0;
        int scoreP2 = 0;

        for (String win : wins) {
            if (win.equals(nameP1)) {
                scoreP1++;
            } else if (win.equals(nameP2)) {
                scoreP2++;
            }
        }

        if (scoreP1 >= 3 && scoreP2 >= 3) {
            if (scoreP1 == scoreP2) {
                return "DEUCE";
            } else if (scoreP1 == scoreP2 + 1) {
                return nameP1 + " ADVANTAGE";
            } else if (scoreP2 == scoreP1 + 1) {
                return nameP2 + " ADVANTAGE";
            } else if (scoreP1 >= scoreP2 + 2) {
                return nameP1 + " WINS";
            } else if (scoreP2 >= scoreP1 + 2) {
                return nameP2 + " WINS";
            }
        }

        String score1 = getScore(scoreP1);
        String score2 = getScore(scoreP2);

        if (scoreP1 == scoreP2) {
            return score1 + "a";
        }

        return nameP1 + " " + score1 + " - " + nameP2 + " " + score2;
    }

    private static String getScore(int score) {
        switch (score) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "";
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String nameP1 = in.nextLine();
        String nameP2 = in.nextLine();
        int playedCount = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] wins = new String[playedCount];
        for (int i = 0; i < playedCount; i++) {
            wins[i] = in.nextLine();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        String gameState = computeGameState(nameP1, nameP2, wins);
        System.setOut(outStream);
        System.out.println(gameState);
    }
}
