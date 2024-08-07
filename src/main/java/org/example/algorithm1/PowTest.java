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

//        System.out.println(myPow(2.00, 10));
        System.out.println(myPow2(2.00, 38));
    }


    public double myPow(double x, int n) {
        if (x == 1 || x == 0) return x;

        return n < 0 ? 1 / quickMul(x, -n) : quickMul(x, n);

    }


    public double quickMul(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double y = quickMul(x, n / 2);


        return n % 2 == 0 ? y * y : y * y * x;
    }


    public double myPow2(double x, int n) {
        if (x == 0 || x == 1) return x;

        double rs = 1;
        // 这里注意使用了long
        long nx = n;
        nx = nx < 0 ? -nx : nx;

        // 这个看起来只要乘以相应数量的x就行了
        while (nx > 0) {
            if (nx % 2 == 1) {
                rs = rs * x;
            }

            x *= x;
            nx = nx / 2;
        }

        return n < 0 ? 1 / rs : rs;
    }


}
