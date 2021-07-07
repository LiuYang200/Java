package com.neu.easy;

public class EOffer58 {
    public String reverseLeftWords(String s, int n) {
        String str = s.substring(n) +
                s.substring(0, n);
        return str;
    }
}
