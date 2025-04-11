package org.example.algorithm1;

import org.junit.Test;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/lho7d1/">文物朝代判断</a>
 */
public class PlacementOfArtifactsTest {


    public boolean checkDynasty(int[] places) {

        Arrays.sort(places);
        int firstKnow = 0;

        for (int i = 0; i < places.length; i++) {
            if (places[i] == 0) {
                continue;
            }
            firstKnow = i;
            break;
        }

        for (int i = firstKnow; i < places.length - 1; i++) {
            if (places[i + 1] == places[i]) {
                return false;
            }
        }

        return places[places.length - 1] - places[firstKnow] < 5;
    }


    public boolean checkDynasty2(int[] places) {

        Arrays.sort(places);

        int firstKnow = 0;
        for (int i = 0; i < places.length - 1; i++) {
            if (places[i] == 0) {
                firstKnow++;
            } else if (places[i + 1] == places[i]) {
                return false;
            }
        }

        return places[places.length - 1] - places[firstKnow] < 5;
    }


    @Test
    public void test1() {
//        int[] places = {0, 6, 9, 0, 7};
//        int[] places = {7, 8, 9, 10, 11};
        int[] places = {0, 0, 5, 3, 5};
        System.out.println(checkDynasty(places));
    }

}
