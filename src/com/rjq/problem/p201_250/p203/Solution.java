package com.rjq.problem.p201_250.p203;

import com.rjq.problem.common.model.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode pre = tmp, n = head;
        while (n != null) {
            if (n.val == val) {
                pre.next = n.next;
                n = n.next;
            } else {
                pre = n;
                n = n.next;
            }
        }

        return tmp.next;
    }
}
