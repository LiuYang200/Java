package com.neu.easy;

import java.awt.geom.FlatteningPathIterator;

public class E28 {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll3";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i=0;i+m<=n;i++){
            boolean flag = true;
            for (int j =0;j<m;j++){
                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return i;
            }
        }
        return -1;

    }
}
