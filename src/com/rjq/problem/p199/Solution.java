package com.rjq.problem.p199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.rjq.problem.common.TreeNode;


public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode n = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(n);
        int depth = 0;
        while (!queue.isEmpty()) {
            
        }

        return result;
    }
}
