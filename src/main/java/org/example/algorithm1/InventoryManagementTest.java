package org.example.algorithm1;

import org.junit.Test;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/lheu7m/">库存管理 III</a>
 *
 * @author suncheng
 */
public class InventoryManagementTest {


    @Test
    public void test1() {

        int[] arr = {10, 33, 34, 54, 56, 12, 8, 87, 54};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    public int[] inventoryManagement(int[] stock, int cnt) {

        Arrays.sort(stock);

        int[] rs = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            rs[i] = stock[i];
        }

        return rs;
    }


    @Test
    public void testQuickSort() {
        int[] arr = {23, 454, 11, 3434, 45};
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }

    /**
     * 快速排序
     */
    public int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }

        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        // 基准值
        int pivot = left;
        int index = pivot + 1;
        // 看成一个算子，会把小的放到前面去
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }

        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


}
