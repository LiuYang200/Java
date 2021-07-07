package com.neu.easy;

import java.util.Deque;
import java.util.LinkedList;

public class E20 {
    public static void main(String[] args) {
        String s = "()";
        isValid(s);
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int len = s.length();
        Deque<Character> stack = new LinkedList<Character>();
        if (len % 2 == 1) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            }
            else if (s.charAt(i) == '[') {
                stack.push(']');
            }
            else if (s.charAt(i) == '{') {
                stack.push('}');
            }

            else if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
