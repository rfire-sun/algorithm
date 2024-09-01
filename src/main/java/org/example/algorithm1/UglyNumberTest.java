package org.example.algorithm1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/9h3im5/">丑数</a>
 */
public class UglyNumberTest {


    @Test
    public void test() {

        System.out.println(nthUglyNumber2(10));

    }


    public int nthUglyNumber2(int n) {

        int p2 = 0, p3 = 0, p5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            int temp = Math.min(Math.min(dp[p2] * 2, dp[p3] * 3), dp[p5] * 5);
            dp[i] = temp;
            if (temp == dp[p2] *2) {
                p2++;
            }
            if (temp == dp[p3] * 3) {
                p3++;
            }
            if (temp == dp[p5] * 5) {
                p5++;
            }
        }

        return dp[n - 1];

    }


    /**
     * 超时了
     */
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int i = 1;

        for (int j = 0; j < dp.length; j++) {
            if (predicateUglyNumber(i)) {
                dp[j] = i;
            }
            i++;
        }

        return dp[n - 1];
    }


    private boolean predicateUglyNumber(int number) {
        if (number == 2 || number == 3 || number == 5 || number == 1 || number == 0) {
            return true;
        }

        int[] primeNum = {2, 3, 5};
        int temp = number;

        for (int i = 0; i < primeNum.length; i++) {

            int rmd = temp % primeNum[i];
            int quotient = temp / primeNum[i];

            if (rmd != 0) {
                continue;
            } else if (rmd == 0) {
                return predicateUglyNumber(quotient);
            }

        }

        return false;
    }

}
