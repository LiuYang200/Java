package com.neu;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String patter = "ABCDABCE";
        int[] next = getNext(patter);
        System.out.println(Arrays.toString(next));
    }
    public static int[] getNext(String p) {
        int n = p.length(), k = -1, j = 0;
        int[] next = new int[n];
        while (j < n - 1) {
            if (k == -1 || p.charAt(j) == p.charAt(k)) {
                ++k; ++j;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
