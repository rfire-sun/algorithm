package org.example.algorithm1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class VeryEasyTest {


    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                list.add(i);
            }
        }

        return list;
    }

    public int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }


    public int scoreOfString(String s) {

        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs((s.charAt(i) - s.charAt(i + 1)));
        }

        return score;
    }

    @Test
    public void test() {
        System.out.println(numberGame(new int[]{2, 1, 5, 4}));
    }

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[2 * i];
            nums[2 * i] = nums[2 * i + 1];
            nums[2 * i + 1] = temp;
        }

        return nums;
    }
}
