package com.krnchik.tasks.leetCode.Task16;

public class InvertBinaryTree {
    public static void main(String[] args) {
        InvertBinaryTree invertTree = new InvertBinaryTree();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null),
                new TreeNode(2, null, null));
        invertTree.invertTree(root);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private void swap(TreeNode root) {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
