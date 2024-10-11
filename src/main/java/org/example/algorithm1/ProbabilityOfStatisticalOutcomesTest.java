package org.example.algorithm1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProbabilityOfStatisticalOutcomesTest {


    public static void main(String[] args) {

        double[] dp = new ProbabilityOfStatisticalOutcomesTest().statisticsProbability(3);
        System.out.println(dp);

    }

    public double[] statisticsProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp, 1.0 / 6.0);

        for (int i = 2; i <= n; i++) {
            double[] temp = new double[5 * i + 1];

            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j + k] += dp[j] / 6.0;
                }
            }

            dp = temp;
        }

        return dp;
    }
}
