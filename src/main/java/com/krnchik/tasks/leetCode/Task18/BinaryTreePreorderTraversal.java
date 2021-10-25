package com.krnchik.tasks.leetCode.Task18;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        BinaryTreePreorderTraversal preorderTraversal = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1, new TreeNode(-1, null, null),
                new TreeNode(3, null, null));
        System.out.println(preorderTraversal.preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        return preorderTraversal(root, nodes);
    }

    private List<Integer> preorderTraversal(TreeNode root, List<Integer> nodes) {
        if (root != null) {
            nodes.add(root.val);
            preorderTraversal(root.left, nodes);
            preorderTraversal(root.right, nodes);
        }
        return nodes;
    }
}
