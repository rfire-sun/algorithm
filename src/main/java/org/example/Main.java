package org.example;

import org.junit.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }


    @Test
    public void test1(){

        int[] prices = {2, 5, 7, 8};
        int n = 4;

        System.out.println(maxCakePrice(n, prices));

    }

    // 输入蛋糕价格列表 priceList ，求重量为 n 蛋糕的最高售价
    int maxCakePrice(int n, int[] priceList) {
        if (n <= 1) return priceList[n]; // 蛋糕重量 <= 1 时直接返回
        int f_n = 0;
        for (int i = 0; i < n; i++)      // 从 n 种组合种选择最高售价的组合作为 f(n)
            f_n = Math.max(f_n, maxCakePrice(i, priceList) + priceList[n - i]);
        return f_n;                      // 返回 f(n)
    }
}