package org.example.algorithm1;

import org.junit.Test;

public class CountOffTest {


    public static void main(String[] args) {

    }


    @Test
    public void test1(){

    }



    public int[] countNumbers(int cnt) {

        int num = (int )Math.pow(10, cnt) - 1;
        int[] rsArr = new int[num];
        for (int i = 1; i <= num; i++) {

            rsArr[i - 1] = i;
        }


        return rsArr;
    }


    public int tenPow(int cnt){



        return 0;

    }




}
