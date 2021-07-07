package com.neu.easy;

import com.neu.ListNode;

public class E206 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode node5 = new ListNode(5, node4);
        ListNode node6 = new ListNode(6, node5);
        ListNode node = new ListNode();
        node = reverseList2(node6);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;

        }
    }


    public static ListNode reverseList(ListNode head) {
        ListNode virtualHeadOfReverse = new ListNode();
        ListNode node = null;
        while (head != null) {
            node = new ListNode(head.val, virtualHeadOfReverse.next);
            virtualHeadOfReverse.next = node;

            head = head.next;
        }
        return virtualHeadOfReverse.next;
    }

    public static ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
