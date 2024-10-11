package org.example.algorithm1.mergesort;

import org.junit.Test;

/**
 *
 */
public class TotalNumberOfReverseOrderPairsTradedTest {

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        int[] arr = {9, 7, 5, 4, 6};
        System.out.println(reversePairs2(arr));
    }



    int[] record;
    int[] tmp;
    public int reversePairs2(int[] record) {
        this.record = record;
        this.tmp = new int[record.length];
        return mergeSort(0, record.length - 1);
    }


    private int mergeSort(int l, int r) {
        // 终止条件
        if (l >= r) {
            return 0;
        }
        // 递归划分
        int m = (l + r) / 2;
        int res = mergeSort(l, m) + mergeSort(m + 1, r);

        // 合并阶段
        // 单纯的copy了一下数组
        for (int k = l; k <= r; k++) {
            tmp[k] = record[k];
        }

        int i = l, j = m + 1;
        for (int k = l; k <= r; k++) {
            if (i == m + 1) {
                record[k] = tmp[j++];
            } else if (j == r + 1 || tmp[i] <= tmp[j]) {
                record[k] = tmp[i++];
            } else {
                record[k] = tmp[j++];
                //统计逆序对
                res += m - i + 1;
            }

        }
        return res;
    }




    /**
     * 暴力递归   超时了
     *
     * @param record
     * @return
     */
    public int reversePairs(int[] record) {
        dfs(record, 0);

        return count;
    }

    private int count = 0;

    private void dfs(int[] record, int index) {
        if (index >= record.length) {
            return;
        }

        for (int i = index + 1; i < record.length; i++) {
            if (record[index] > record[i]) {
                count++;
            }
        }

        dfs(record, index + 1);
    }







}
