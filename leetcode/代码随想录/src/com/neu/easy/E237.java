package com.neu.easy;

import com.neu.ListNode;

public class E237 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
