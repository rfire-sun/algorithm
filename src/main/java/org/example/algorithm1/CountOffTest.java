package org.example.algorithm1;

import org.junit.Test;

public class CountOffTest {


    public static void main(String[] args) {

    }


    @Test
    public void test1() {

    }

    @Test
    public void testTenPow(){

        System.out.println(dfs(5));

    }

    public int[] countNumbers(int cnt) {

        int num = (int) Math.pow(10, cnt) - 1;
        int[] rsArr = new int[num];
        for (int i = 1; i <= num; i++) {

            rsArr[i - 1] = i;
        }


        return rsArr;
    }

    public int[] countNumbers1(int cnt) {

        int num = dfs(cnt) - 1;
        int[] rsArr = new int[num];
        for (int i = 1; i <= num; i++) {

            rsArr[i - 1] = i;
        }


        return rsArr;
    }
    private int dfs(int cnt) {
        if (cnt <= 0) {
            return 1;
        }

        int y = dfs(cnt / 2);


        return cnt % 2 == 0 ? y * y : y * y * 10;
    }




}
