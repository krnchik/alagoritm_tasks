package com.krnchik.tasks.leetCode.Task19;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(-1, null, null),
                new TreeNode(3, null, null));
        PathSum pathSum = new PathSum();
        System.out.println(pathSum.hasPathSum(root, 2));
        System.out.println(pathSum.hasPathSumBetter(root, 2));
    }

    int target;

    public boolean hasPathSumBetter(TreeNode root, int targetSum) {
        target = targetSum;
        return helper(root, 0);
    }

    public boolean helper(TreeNode curr, int tally) {
        if (curr == null)
            return false;

        if (curr.left == null && curr.right == null)
            return target == tally + curr.val;

        return helper(curr.left, tally + curr.val)
                || helper(curr.right, tally + curr.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        List<Integer> sums = saveSum(root, new ArrayList<>(), 0);

        for (Integer sum : sums) {
            if (sum == targetSum)
                return true;
        }

        return false;
    }

    private List<Integer> saveSum(TreeNode root, List<Integer> sums, int sum) {
        sum += root.val;

        if (isLeaf(root)) {
            sums.add(sum);
        }

        if (root.left != null)
            saveSum(root.left, sums, sum);

        if (root.right != null)
            saveSum(root.right, sums, sum);

        return sums;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
