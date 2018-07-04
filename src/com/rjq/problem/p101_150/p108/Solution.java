package com.rjq.problem.p101_150.p108;

import com.rjq.problem.common.model.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int start = 0, end = nums.length - 1;
        return getTree(nums, start, end);
    }

    // -10,-3,0,5,9
    private TreeNode getTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }

        int half = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[half]);
        root.left = getTree(nums, start, half - 1);
        root.right = getTree(nums, half + 1, end);

        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode treeNode = new Solution().sortedArrayToBST(nums);
        System.out.println(treeNode.val);

    }
}

