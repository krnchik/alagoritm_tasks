package com.krnchik.tasks.leetCode.Task5;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight", "fly"};
        System.out.println(commonPrefix(arr));
    }

    private static String commonPrefix(String[] arr) {
        String result = arr[0];
        for (int i = 1; i < arr.length; i++) {

            String value = arr[i];
            int length = value.length();

            while (!value.equals(result)) {
                if (length > result.length()){
                    value = value.substring(0, length - 1);
                    length--;
                } else if (length < result.length()) {
                    result = result.substring(0, result.length() - 1);
                } else {
                    value = value.substring(0, length - 1);
                    length--;
                    result = result.substring(0, result.length() - 1);
                }
            }
        }
        return result;
    }
}
