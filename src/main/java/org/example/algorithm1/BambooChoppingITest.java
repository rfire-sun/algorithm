package org.example.algorithm1;


import org.junit.Test;

/**
 * <a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/lhp2v5/">砍竹子 I</a>
 */
public class BambooChoppingITest {

    @Test
    public void test() {

//        System.out.println(cuttingBamboo(29));
//        System.out.println(cuttingBamboo(12));
//        System.out.println(cuttingBamboo(10));
        System.out.println(cuttingBamboo(8));
        System.out.println(cuttingBamboo(9));
        System.out.println(cuttingBamboo(10));
        System.out.println(cuttingBamboo(30));
    }


    public int cuttingBamboo(int bamboo_len) {
        int[] dp = new int[bamboo_len + 1];
        for (int i = 2; i <= bamboo_len; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[bamboo_len];
    }


    public int cuttingBamboo1(int bamboo_len) {

        // 切成的块数
        int max = -1;
        for (int i = 2; i < bamboo_len; i++) {
            int rs = calculate(bamboo_len, i);
            if (rs > max) {
                max = rs;
            }
        }

        return max;
    }

    private int calculate(int len, int n) {

        int ele = len / n;
        int rm = len % n;

        if (rm == 0) {
            return (int) Math.pow(ele, n);
        } else {
            return (int) Math.pow(ele + 1, rm) * (int) Math.pow(ele, n - rm);
        }
    }

//    private int calculate(int len, int n) {
//
//        int ele = len / n;
//
//        // 向上取整
//        int ele1 = ele;
//        int max1 = (int )Math.pow(ele1,n-1) * (len - ele1 * (n-1));
//
//        // 向下取整
//        int ele2 = ele + 1;
//        int max2 = (int )Math.pow(ele2,n-1) * (len - ele2 * (n-1));
//
//        return Math.max(max1,max2);
//    }

}
