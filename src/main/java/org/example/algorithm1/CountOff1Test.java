package org.example.algorithm1;

import org.junit.Test;

public class CountOff1Test {


    @Test
    public void test1(){
//        System.out.println(String.valueOf(new char[3]));
        System.out.println(countNumbers(3));
    }

    StringBuilder res;
    int count, cnt;
    char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public String countNumbers(int cnt) {
        this.cnt = cnt;
        res = new StringBuilder(); // 数字字符串集
        num = new char[cnt]; // 定义长度为 cnt 的字符列表

        dfs(0); // 开启全排列递归

        res.deleteCharAt(res.length() - 1); // 删除最后多余的逗号
        return res.toString(); // 转化为字符串并返回
    }

    void dfs(int x) {
        if (x == cnt) { // 终止条件：已固定完所有位
            res.append(String.valueOf(num) + ","); // 拼接 num 并添加至 res 尾部，使用逗号隔开
            return;
        }
        for (char i : loop) { // 遍历 ‘0‘ - ’9‘
            num[x] = i; // 固定第 x 位为 i
            dfs(x + 1); // 开启固定第 x + 1 位
        }
    }


}
