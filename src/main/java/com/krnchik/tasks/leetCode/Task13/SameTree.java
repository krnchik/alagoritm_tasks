package com.krnchik.tasks.leetCode.Task13;

public class SameTree {
    public static void main(String[] args) {
        SameTree sameTree = new SameTree();

        TreeNode root1 = new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null));
        TreeNode root2 = new TreeNode(2, null, new TreeNode(4, null, null));

        System.out.println(sameTree.isSameTree(root1, root2));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
