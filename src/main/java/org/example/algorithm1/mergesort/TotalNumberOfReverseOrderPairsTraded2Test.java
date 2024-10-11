package org.example.algorithm1.mergesort;

import org.junit.Test;

public class TotalNumberOfReverseOrderPairsTraded2Test {


    @Test
    public void test1(){
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println(reversePairs(array));
    }

    public int reversePairs(int[] record) {
        int len = record.length;

        if (len < 2) {
            return 0;
        }

        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = record[i];
        }

        int[] temp = new int[len];
        return reversePairs(copy, 0, len - 1, temp);
    }

    private int reversePairs(int[] record, int left, int right, int[] temp) {
        if (left == right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int leftPairs = reversePairs(record, left, mid, temp);
        int rightPairs = reversePairs(record, mid + 1, right, temp);

        if (record[mid] <= record[mid + 1]) {
            return leftPairs + rightPairs;
        }

        int crossPairs = mergeAndCount(record, left, mid, right, temp);
        return leftPairs + rightPairs + crossPairs;
    }

    private int mergeAndCount(int[] record, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = record[i];
        }

        int i = left;
        int j = mid + 1;

        int count = 0;
        for (int k = left; k <= right; k++) {

            if (i == mid + 1) {
                record[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                record[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                record[k] = temp[i];
                i++;
            } else {
                record[k] = temp[j];
                j++;
                count += (mid - i + 1);
            }
        }
        return count;
    }
}