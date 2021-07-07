package com.neu.easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class E225 {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public E225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public  void push(int x) {
        queue2.offer(x);
        if (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue1.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

