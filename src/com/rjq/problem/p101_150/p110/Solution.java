package com.rjq.problem.p101_150.p110;

import com.rjq.problem.common.util.TreeBuilder;
import com.rjq.problem.common.model.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    public static void main(String[] args) {
//        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
//        Integer[] nums = new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4};
        Integer[] nums = new Integer[]{1, 2, 2, 3, null, null, 3, 4, null, null, 4};
        TreeNode root = TreeBuilder.buildBinaryTree(nums);
        System.out.println(new Solution().isBalanced(root));

    }
}
