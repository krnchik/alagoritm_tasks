package com.krnchik.tasks.leetCode.Task14;

public class SymmetricTree {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return false;
        if (root.left != null && root.right != null) {
            if (root.left.val == root.right.val) {
                return isSymmetricNode(root.left, root.right);
            }
        }
        return false;
    }

    private boolean isSymmetricNode(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSymmetricNode(p.left, q.right) && isSymmetricNode(p.right, q.left);
    }
}
