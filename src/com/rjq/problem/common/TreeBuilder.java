package com.rjq.problem.common;

import java.util.LinkedList;
import java.util.Queue;

public final class TreeBuilder {

    /**
     * 按数组构建二叉树
     * 如:[3,9,20,null,null,15,7]
     *  3
     * / \
     * 9  20
     *   /  \
     *  15   7
     *
     * @param nums
     * @return
     */
    public static TreeNode buildBinaryTree(Integer nums[]) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                int leftIndex = 2 * index;
                TreeNode left = (leftIndex > nums.length || nums[leftIndex - 1] == null) ?
                        null : new TreeNode(nums[leftIndex - 1]);
                node.left = left;
                queue.offer(left);

                int rightIndex = 2 * index + 1;
                TreeNode right = (rightIndex > nums.length || nums[rightIndex - 1] == null) ?
                        null : new TreeNode(nums[rightIndex - 1]);
                node.right = right;
                queue.offer(right);
            }

            index++;
        }

        return root;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = buildBinaryTree(nums);
        System.out.println(treeNode.val);
    }
}
