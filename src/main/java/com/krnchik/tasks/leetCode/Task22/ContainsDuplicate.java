package com.krnchik.tasks.leetCode.Task22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 10, -1, 25, 10, 1};
        System.out.println(new ContainsDuplicate()
                .containsDuplicate(nums));
        System.out.println(new ContainsDuplicate()
                .containsDuplicateAnother(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }

    public boolean containsDuplicateAnother(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
