package com.neu.easy;

public class E344 {
    public static void main(String[] args) {
        char[] s = new char[]{'1','2','3','4'};
        reverseString(s);
        System.out.println(s);
    }
    public static void reverseString(char[] s) {
        char c;
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            c = s[left];
            s[left] = s[right];
            s[right] = c;
            right--;
            left++;
        }
    }
}
