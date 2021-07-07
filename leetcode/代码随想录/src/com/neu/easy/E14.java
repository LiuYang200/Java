package com.neu.easy;

import java.util.HashSet;
import java.util.Set;

public class E14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int count = strs.length;
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];


    }
}
