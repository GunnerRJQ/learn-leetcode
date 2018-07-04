package com.rjq.problem.p201_250.p234;

import com.rjq.problem.common.model.ListNode;
import com.rjq.problem.common.util.ListBuilder;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode oldHead = new ListNode(-1);
        ListNode newHead = new ListNode(-1);
        oldHead.next = head;
        ListNode slow = oldHead, fast = oldHead;
        // 慢指针每次走一步,快指针每次走两步
        // 将慢指针指向的节点依次插入到新头节点之后
        // 快指针走到头后,依次比较新老头结点之后的节点即可
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            ListNode tmp = slow;
            oldHead.next = slow.next;
            tmp.next = newHead.next;
            newHead.next = tmp;
            slow = oldHead;
        }

        slow = slow.next;
        if (fast == null) {
            newHead = newHead.next.next;
        } else {
            newHead = newHead.next;
        }

        while (slow != null) {
            if (slow.val != newHead.val) {
                return false;
            }

            slow = slow.next;
            newHead = newHead.next;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 1};
        ListNode node = ListBuilder.buildList(nums);
        System.out.println(new Solution().isPalindrome(node));
    }
}
