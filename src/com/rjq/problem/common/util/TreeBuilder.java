package com.rjq.problem.common.util;

import java.util.LinkedList;
import java.util.Queue;

import com.rjq.problem.common.model.TreeNode;

public final class TreeBuilder {

    /**
     * !!!和LeetCode构建的树好像不大一样!!!
     * [7,0,null,-1,-6,null,1,null,null,-7] 根节点7右子树为null,后续数组中就再无后续子节点存储
     *
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
