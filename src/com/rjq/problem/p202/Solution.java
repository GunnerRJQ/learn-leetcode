package com.rjq.problem.p202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> notHappy = new HashSet<Integer>();
        int num = n;
        while (true) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            if (sum == 1) {
                return true;
            } else if (notHappy.contains(sum)) {
                return false;
            }

            notHappy.add(sum);
            num = sum;
        }
    }

    public static void main(String[] args) {
        int n = 19;
//        int n = 2;
        Solution s = new Solution();
        boolean happy = s.isHappy(n);
        System.out.println(happy);
    }
}
