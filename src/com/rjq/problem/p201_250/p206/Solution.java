package com.rjq.problem.p201_250.p206;

import com.rjq.problem.common.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr.next != null) {
            ListNode tmp = curr.next;
            curr.next = tmp.next;
            tmp.next = head;
            head = tmp;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;

        ListNode listNode = new Solution().reverseList(head);
        System.out.println(listNode.val);
    }
}
