package com.neu.easy;

import sun.applet.Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E383 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        boolean b = canConstruct(s1, s2);
        System.out.println(b);


    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            if (map.containsKey(ransomNote.charAt(j))) {
                map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j)) - 1);
            } else {
                return false;
            }
        }

        for (Integer count : map.values()) {
            if (count < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            count[ransomNote.charAt(j) - 'a']--;
        }
        for (int c : count) {
            if (c < 0) {
                return false;
            }
        }
        return true;
    }
}
