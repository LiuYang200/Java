package com.neu.medium;

import com.neu.ListNode;

public class M707 {
    /**
     * Initialize your data structure here.
     */
    int size;
    ListNode head;

    public M707() {
        this.size = 0;
        this.head = new ListNode();
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        ListNode cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;

    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head.next == null) {
            head.next = new ListNode(val);
        }else {
            ListNode cur = head.next;
            head.next = new ListNode(val, cur);
        }

        size++;

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index > size) {
            return;
        } else {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            cur.next = new ListNode(val, cur.next);
            size++;
        }


    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size) {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            size--;
        }

    }

    public void print() {
        ListNode cur = head.next;
        while (cur != null) {
            System.out.print(cur.val + "-->");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        M707 linkedList = new M707();
        linkedList.addAtIndex(0, 10);   //链表变为1-> 2-> 3
        linkedList.print();
        linkedList.addAtIndex(0, 20);   //链表变为1-> 2-> 3
        linkedList.print();
        linkedList.addAtIndex(1, 30);   //链表变为1-> 2-> 3
        linkedList.print();
        System.out.println(linkedList.get(0) +"=============20");            //返回2



    }
}
