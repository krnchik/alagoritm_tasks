package com.krnchik.tasks.leetCode.Task23;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber()
                .singleNumber(new int[]{4,1,2,4,5,1,2}));
    }

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
