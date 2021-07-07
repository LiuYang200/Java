package com.neu.medium;

import com.neu.ListNode;

import java.util.HashSet;
import java.util.Set;

public class M142 {

    //哈希表
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();
        ListNode pos = head;
        while (pos != null) {
            if (listNodes.contains(pos)) {
                return pos;
            } else {
                listNodes.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

    //快慢指针
    public ListNode detectCycle2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    slow = slow.next;
                    ptr = ptr.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
