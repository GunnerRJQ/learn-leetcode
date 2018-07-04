package com.rjq.problem.p201_250.p226;

import com.rjq.problem.common.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode n = root;
        TreeNode tmp = n.left;
        n.left = n.right;
        n.right = tmp;

        invertTree(n.left);
        invertTree(n.right);

        return root;
    }
}
