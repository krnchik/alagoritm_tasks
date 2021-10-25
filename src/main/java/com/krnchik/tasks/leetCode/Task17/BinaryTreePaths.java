package com.krnchik.tasks.leetCode.Task17;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(-1, null, null),
                new TreeNode(3, null, null));
        BinaryTreePaths treePaths = new BinaryTreePaths();
        System.out.println(treePaths.binaryTreePaths(root));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        return searchPaths(root, "", paths);
    }

    private List<String> searchPaths(TreeNode root, String path, List<String> paths) {
        path += root.val + "->";
        if (isLeaf(root)) {
            path = path.substring(0, path.length() - 2);
            paths.add(path);
        }
        if (root.left != null)
            searchPaths(root.left, path, paths);
        if (root.right != null)
            searchPaths(root.right, path, paths);
        return paths;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
