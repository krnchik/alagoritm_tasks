package com.krnchik.tasks.leetCode.Task30;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2, null, null),
                new TreeNode(3, null, null));
        TreeNode root2 = new TreeNode(1, new TreeNode(2, null, null),
                null);
        System.out.println(new MergeTwoBinaryTrees().mergeTrees(root1, root2));
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;

        TreeNode node = new TreeNode(root1.val + root2.val);

        node.left = mergeTrees(root1.left, root2.left);
        node.right = mergeTrees(root1.right, root2.right);

        return node;
    }
}
