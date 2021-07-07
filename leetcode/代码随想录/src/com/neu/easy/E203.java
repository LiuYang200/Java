package com.neu.easy;

import com.neu.ListNode;

public class E203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode virtualHead = new ListNode(0, head);
        ListNode cur = virtualHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return virtualHead.next;
    }
}
