package org.example.algorithm1;

import org.junit.Test;

/**
 * <a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/57rwmg/">Pow(x, n)</a>
 */
public class PowTest {

    public static void main(String[] args) {
        int x = 16;
        x >>= 2;
        System.out.println(x);
        System.out.println(8 >> 1);
    }

    @Test
    public void testPowers() {

        System.out.println(myPow(2.00, 10));
    }


    public double myPow(double x, int n) {
        if (x == 1 || x == 0) return x;

        return n < 0 ? 1/quickMul(x, -n) : quickMul(x, n);

    }


    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1;
        }

        double y = quickMul(x, N / 2);


        return N % 2 == 0 ? y * y : y * y * x;
    }


}
