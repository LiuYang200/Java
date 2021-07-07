package com.neu.easy;

import java.util.Arrays;

public class E242 {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        isAnagram2(s,t);
    }

    public static boolean isAnagram(String s, String t) {

        s = strSort(s);
        t = strSort(t);
        return s.equals(t);


    }

    public static String strSort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }


    public static boolean isAnagram2(String s, String t) {
        int[] record = new int[26];

        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            record[t.charAt(j) - 'a']--;
        }
        for (int r : record) {
            if (r != 0) {
                return false;
            }
        }
        return true;
    }


}
