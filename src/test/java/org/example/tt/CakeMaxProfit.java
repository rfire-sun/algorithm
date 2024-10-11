package org.example.tt;

import org.junit.Test;

public class CakeMaxProfit {
    // Function to calculate the maximum profit for a cake of weight n using brute-force recursion
    public static int maxProfit(int[] prices, int n) {
        // Base case: if n is 0, the maximum profit is 0 (no cake to sell)
        if (n == 0) {
            return 0;
        }

        int maxProfit = 0;

        // Try all possible cuts
        for (int i = 1; i <= n; i++) {
            // Calculate profit by making a cut of weight i   切一坨出来
            int currentProfit = prices[i - 1] + maxProfit(prices, n - i);

            // Update the maximum profit if the current cut is better
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // Example: prices for cake pieces of weight 1 to 4
        int[] prices = {2, 5, 7, 8};
        int n = 4;

        // Calculate and print the maximum profit for the cake of weight n
        int result = maxProfit(prices, n);
        System.out.println("Maximum profit for weight " + n + " is: " + result);
    }





}
