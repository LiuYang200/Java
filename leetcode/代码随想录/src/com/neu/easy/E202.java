package com.neu.easy;

import java.util.HashSet;
import java.util.Set;

public class E202 {
    public static void main(String[] args) {
        System.out.println(getSum(19445));
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            sum += d * d;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSum(n);
        }
        return n == 1;
    }

    public boolean isHappy2(int n) {
        int slowRunner = n;
        int fastRunner = getSum(n);
        while (slowRunner != 1 && slowRunner!=fastRunner) {
            slowRunner=getSum(slowRunner);
            fastRunner=getSum(getSum(fastRunner));
        }
        return slowRunner == 1;
    }
}
