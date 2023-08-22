package com.leetcode;

public class sum1dArray {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                wealth += col;
            }

        }
        return wealth;

    }
}
