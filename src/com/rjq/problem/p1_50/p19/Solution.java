package com.rjq.problem.p1_50.p19;

import com.rjq.problem.common.model.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmpHead = new ListNode(-1);
        tmpHead.next = head;
        ListNode target = tmpHead, end = tmpHead;

        for (int i = 1; i <= n; ++i) {
            end = end.next;
        }

        while (end.next != null) {
            target = target.next;
            end = end.next;
        }

        target.next = target.next.next;

        return tmpHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;

        ListNode listNode = new Solution().removeNthFromEnd(head, 5);
        System.out.println(listNode.val);
    }

}
