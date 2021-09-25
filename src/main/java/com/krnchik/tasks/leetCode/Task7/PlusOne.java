package com.krnchik.tasks.leetCode.Task7;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] number = {1, 8, 9, 0};
        System.out.println(Arrays.toString(plusOne(number)));
    }

    private static int[] plusOne(int[] number) {
        int[] result = number;
        boolean worstHappening = true;
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] == 9){
                result[i] = 0;
            } else {
                result[i] += 1;
                worstHappening = false;
                break;
            }
        }
        if (worstHappening) {
            int length = result.length + 1;
            result = new int[length];
            result[0] = 1;
        }
        return result;
    }
}
