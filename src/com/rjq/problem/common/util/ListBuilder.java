package com.rjq.problem.common.util;

import com.rjq.problem.common.model.ListNode;

public class ListBuilder {
    public static ListNode buildList(int[] nums) {
        ListNode head = new ListNode(-1);
        ListNode n = head;
        for (int num : nums) {
            n.next = new ListNode(num);
            n = n.next;
        }

        return head.next;
    }
}
