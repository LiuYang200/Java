package com.neu.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E349 {


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n1 : nums1) {
            set1.add(n1);
        }
        for (int n2 : nums2) {
            set2.add(n2);
        }
        return getIntersection(set1, set2);

    }

    public int[] getIntersection(Set<Integer> s1, Set<Integer> s2) {
        if (s1.size() < s2.size()) {
            return getIntersection(s2, s1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer s : s2) {
            if (s1.contains(s)) {
                set.add(s);
            }
        }

        int[] intersection = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            intersection[index] = i;
            index++;
        }
        return intersection;
    }


}
