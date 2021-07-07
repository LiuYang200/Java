package com.neu.medium;

import java.util.Stack;

public class M150 {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        evalRPN(tokens);
    }
    public static int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s)) {
                ans = stack.pop() + stack.pop();
                stack.push(ans);
            } else if ("-".equals(s)) {
                ans = stack.pop() - stack.pop();
                stack.push(-ans);
            } else if ("*".equals(s)) {
                ans = stack.pop() * stack.pop();
                stack.push(ans);
            } else if ("/".equals(s)) {
                int p1 = stack.pop();
                int p2 = stack.pop();
                ans = p2 / p1;
                stack.push(ans);
            } else {
                ans =Integer.parseInt(s);
                stack.push(ans);

            }

        }
        return ans;
    }
}
