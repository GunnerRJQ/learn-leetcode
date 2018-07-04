package com.rjq.problem.p101_150.p101;

import com.rjq.problem.common.model.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricRecursive(root.left, root.right);
    }

    private boolean isSymmetricRecursive(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetricRecursive(left.left, right.right) && isSymmetricRecursive(left.right, right.left);
    }
}
