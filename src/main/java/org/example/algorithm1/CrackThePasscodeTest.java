package org.example.algorithm1;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CrackThePasscodeTest {


    @Test
    public void test1() {

//        String str = "123456789";
//        System.out.println(str.substring(3));

        int[] password = {0, 33, 330, 5, 9, 3};

        System.out.println(crackPassword(password));

    }

    public String crackPassword(int[] password) {
        Integer[] array = Arrays.stream(password).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, (x1, x2) -> {
            String str1 = String.valueOf(x1);
            String str2 = String.valueOf(x2);

            return customComparator(str1, str2);

        });
        System.out.println(Arrays.toString(array));


        return Arrays.stream(array).map(String::valueOf).collect(Collectors.joining(""));

    }

    public int customComparator(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                return -1;
            }
        }

        if (str1.length() > str2.length()) {
            return customComparator(str1.substring(str2.length()), str2);
        } else {
            return customComparator(str1, str2.substring(str1.length()));
        }
    }


    public String crackPassword2(int[] password) {

        String[] nums = Arrays.stream(password).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(nums, (x1, x2) -> (x1 + x2).compareTo(x2 + x1));


        return String.join("", nums);
    }


}
