package com.krnchik.tasks.leetCode.Task21;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition()
                .searchInsert(new int[]{1, 3}, 2));
        System.out.println(new SearchInsertPosition()
                .searchInsert(new int[]{1, 3, 7, 8}, 9));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        if (target < nums[left])
            return 0;

        if (target > nums[right])
            return nums.length;

        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
