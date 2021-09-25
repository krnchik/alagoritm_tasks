package com.krnchik.tasks.leetCode.Task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1, 34, 8, 9, 2, 4, 5};
        System.out.println(Arrays.toString(twoSumOptimal(array, 17)));
    }

    private static int[] twoSumOptimal(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int requiredNumber = target - array[i];
            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i){
                return new int[] { array[i], target - array[i]};
            }
        }
        throw new IllegalArgumentException("No solution!!!");
    }

    private static int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            result[0] = array[i];
            for (int j = 1; j < array.length; j++) {
                int sum = result[0] + array[j];
                if (sum == target) {
                    result[1] = array[j];
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No solution!!!");
    }
}
