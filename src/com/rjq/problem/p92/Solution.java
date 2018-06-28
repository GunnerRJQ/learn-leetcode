package com.rjq.problem.p92;

import com.rjq.problem.common.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode tmpHead = new ListNode(-1);
        tmpHead.next = head;

        ListNode pre = tmpHead;
        for (int i = 1; i < m; ++i) {
            pre = pre.next;
        }

        ListNode curr = pre.next;
        for (int i = m; i < n; ++i) {
            ListNode next = curr.next;
            curr.next = next.next;
            ListNode tmp = pre.next;
            pre.next = next;
            next.next = tmp;
        }

        return tmpHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
//        ListNode five = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
//        fourth.next = five;

        ListNode listNode = new Solution().reverseBetween(head, 1, 4);
        System.out.println(listNode.val);
    }
}
