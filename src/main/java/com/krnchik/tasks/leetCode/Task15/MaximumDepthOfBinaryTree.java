package com.krnchik.tasks.leetCode.Task15;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree depth = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, null));
        System.out.println(depth.maxDepth(root));
        System.out.println(depth.maxDepthBetter(root));
    }

    public int maxDepthBetter(TreeNode root) {
        return (root == null) ? 0 : 1 + Math.max(maxDepthBetter(root.left), maxDepthBetter(root.right));
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return countingDepth(root, 1);
    }

    private int countingDepth(TreeNode node, int i) {
        int max1 = i;
        int max2 = i;
        if (node.left != null && node.right != null) {
            return Math.max(countingDepth(node.right, i + 1), countingDepth(node.left, i + 1));
        }
        if (node.left != null) {
            max1 = countingDepth(node.left, i + 1);
        }
        if (node.right != null) {
            max2 = countingDepth(node.right, i + 1);
        }
        return Math.max(max1, max2);
    }
}
