package com.rjq.problem.p101_150.p112;

import com.rjq.problem.common.TreeBuilder;
import com.rjq.problem.common.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        return judgePathSum(root, sum);
    }

    private boolean judgePathSum(TreeNode root, int sum) {
        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        int curr = sum - root.val;
        return (root.left != null && judgePathSum(root.left, curr))
                || (root.right != null && judgePathSum(root.right, curr));
    }

    public static void main(String[] args) {
//        Integer[] nums = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
//        int sum = 22;

//        Integer[] nums = new Integer[]{1, 2};
//        int sum = 1;

//        Integer[] nums = new Integer[]{-2, null, -3};
//        int sum = -5;

//        Integer[] nums = new Integer[]{1, -2, -3, 1, 3, -2, null, -1};
//        int sum = -1;


        Integer[] nums = new Integer[]{7, 0, null, -1, -6, null, 1, null, null, -7};
        int sum = 0;

        TreeNode root = TreeBuilder.buildBinaryTree(nums);
        System.out.println(new Solution().hasPathSum(root, sum));
    }
}
