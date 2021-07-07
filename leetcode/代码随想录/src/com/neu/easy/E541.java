package com.neu.easy;

import java.util.Arrays;

public class E541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseStr(s, 2));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(s);
        int count = s.length() / (2 * k);
        int remainder = s.length() % (2 * k);
        int left;
        int right;
        for (int i = 0; i < count; i++) {
            left = 2 * i * k;
            right = 2 * i * k + k - 1;
            while (left < right) {
                stringBuilder.setCharAt(left, s.charAt(right));
                stringBuilder.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
        }
        if (remainder < k) {
            left = 2 * count * k;
            right = s.length() - 1;
            while (left < right) {
                stringBuilder.setCharAt(left, s.charAt(right));
                stringBuilder.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
        }
        if (remainder >= k) {
            left = 2 * count * k;
            right = 2 * count * k + k - 1;
            while (left < right) {
                stringBuilder.setCharAt(left, s.charAt(right));
                stringBuilder.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static String reverseStr2(String s, int k) {
        char[] chars = s.toCharArray();
        for (int start = 0; start < s.length(); start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, s.length());
            while (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
}
