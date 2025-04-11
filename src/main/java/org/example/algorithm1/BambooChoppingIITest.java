package org.example.algorithm1;


import org.junit.Test;

public class BambooChoppingIITest {

    @Test
    public void test() {

    }



    public int cuttingBamboo(int bamboo_len) {

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


}
