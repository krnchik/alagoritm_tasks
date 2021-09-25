package com.krnchik.tasks.leetCode.Task9;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 7, 8, 1, 2, 7};
        boolean duplicate = containsDuplicate(arr);
        System.out.println(duplicate);
    }

    private static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
