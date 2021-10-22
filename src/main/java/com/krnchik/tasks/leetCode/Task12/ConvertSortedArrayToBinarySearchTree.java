package com.krnchik.tasks.leetCode.Task12;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};
        ConvertSortedArrayToBinarySearchTree toBST = new ConvertSortedArrayToBinarySearchTree();
        TreeNode treeNode = toBST.sortedArrayToBST(arr);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums == null || nums.length == 0)
            return null;
        return BST(nums, left, right);
    }

    private TreeNode BST(int[] nums, int left, int right) {
        if (left > right)
            return null;
        int mid = left + (right - left) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        System.out.print(current.val + " ");
        current.left = BST(nums, left, mid - 1);
        current.right = BST(nums, mid + 1, right);
        return current;
    }
}
