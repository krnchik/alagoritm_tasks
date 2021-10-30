package com.krnchik.tasks.leetCode.Task27;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null),
                new TreeNode(2, new TreeNode(4, new TreeNode(5, null, null), null), null));
        System.out.println(new BalancedBinaryTree().isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        int x = giveHeight(root);
        return x != -1;
    }

    private int giveHeight(TreeNode root) {
        if(root == null)
            return 0;

        int l = giveHeight(root.left);
        int r = giveHeight(root.right);

        if(l == -1 || r == -1) {
            return -1;
        }

        if(Math.abs(l - r) > 1) {
            return -1;
        }

        return 1 + Math.max(l, r);
    }
}
