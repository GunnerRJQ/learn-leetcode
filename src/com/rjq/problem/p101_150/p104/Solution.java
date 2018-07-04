package com.rjq.problem.p101_150.p104;

import com.rjq.problem.common.model.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
