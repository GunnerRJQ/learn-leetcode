package com.rjq.problem.p101_150.p111;

import java.util.LinkedList;
import java.util.Queue;

import com.rjq.problem.common.TreeBuilder;
import com.rjq.problem.common.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            depth++;
        }

        return depth - 1;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
//        Integer[] nums = new Integer[]{1, 2};
        TreeNode root = TreeBuilder.buildBinaryTree(nums);
        System.out.println(new Solution().minDepth(root));

    }
}
