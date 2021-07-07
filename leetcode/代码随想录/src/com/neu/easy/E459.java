package com.neu.easy;

public class E459 {
    public static void main(String[] args) {

        String s = "ababab";
        int len = s.length();
        String preStr = s.substring(0, len / 2);
        String sufStr = s.substring(len / 2);
        System.out.println(preStr);
        System.out.println(sufStr);
    }

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }
        String preStr = s.substring(0, len / 2);
        String sufStr = s.substring(len / 2);
        return preStr.equals(sufStr);
    }
}
