package com.neu.medium;

import java.util.HashMap;
import java.util.Map;

public class M454 {
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        System.out.println(fourSumCount(A, B, C, D));
    }

    //暴力算法 超时
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        int length = nums1.length;
        for (int k1 = 0; k1 < length; k1++) {
            for (int k2 = 0; k2 < length; k2++) {
                for (int k3 = 0; k3 < length; k3++) {
                    for (int k4 = 0; k4 < length; k4++) {
                        if (nums1[k1] + nums2[k2] + nums3[k3] + nums4[k4] == 0) {
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static int fourSumCount2(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int result = 0;
        Map<Integer, Integer> mapAB = new HashMap<>();

        for (int i : nums1) {
            for (int j : nums2) {
                mapAB.put(i + j, mapAB.getOrDefault(i + j, 0) + 1);

            }
        }
        for (int x : nums3) {
            for (int y : nums4) {
                if (mapAB.containsKey(-x - y)) {
                    result += mapAB.get(-x - y);
                }

            }
        }
        return result;
    }
}
