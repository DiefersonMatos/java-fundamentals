package com.matos.exercises.maximal_square;

public class Solution {

    public static void printDP(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maximalSquare(int[][] land) {
        if (land == null || land.length == 0 || land[0].length == 0) return 0;

        int rows = land.length;
        int cols = land[0].length;
        int[][] dp = new int[rows][cols];
        int maxSide = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (land[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        int top = dp[i - 1][j];
                        int left = dp[i][j - 1];
                        int diagonal = dp[i - 1][j - 1];

                        int min;
                        if (top <= left && top <= diagonal) {
                            min = top;
                        } else if (left <= top && left <= diagonal) {
                            min = left;
                        } else {
                            min = diagonal;
                        }
                        dp[i][j] = min + 1;
                    }
                    if (dp[i][j] > maxSide) {
                        maxSide = dp[i][j];
                    }
                }
            }
        }

        printDP(dp);

        return maxSide * maxSide;
    }

    public static int maximalSquare2(int[][] land) {
        if (land == null || land.length == 0 || land[0].length == 0) {
            return 0;
        }

        int rows = land.length;
        int cols = land[0].length;
        int[][] dp = new int[rows][cols];
        int maxSide = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (land[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1; // First row or column
                    } else {
                        dp[i][j] = Math.min(
                                Math.min(dp[i - 1][j], dp[i][j - 1]),
                                dp[i - 1][j - 1]
                        ) + 1;
                    }
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        return maxSide * maxSide; // area = side^2
    }

    public static void main(String[] args) {
        int[][] land = {
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1}
        };

        int maxArea1 = maximalSquare(land);
        System.out.println("Max area of good land: " + maxArea1);

        int maxArea11 = maximalSquare2(land);
        System.out.println("Max area of good land: " + maxArea11);

        int[][] land2 = {
                {0, 1, 1, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1},
                {0, 1, 1, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 0}
        };

        int maxArea2 = maximalSquare(land2);
        System.out.println("Max area of good land: " + maxArea2);

        int maxArea22 = maximalSquare2(land2);
        System.out.println("Max area of good land: " + maxArea22);
    }
}
