package com.neu.medium;

public class M151 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String[] words = s.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word + "    **********************");
        }
    }

    public String reverseWords(String s) {
            String[] words = s.trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                ans.append(words[i]);
                ans.append(" ");
            }
            return ans.toString().trim();
    }
}
