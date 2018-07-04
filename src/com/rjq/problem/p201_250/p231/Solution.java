package com.rjq.problem.p201_250.p231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        long pow = 1;
        while (true) {
            if (n < pow) {
                return false;
            }
            if (n == pow) {
                return true;
            }

            pow = pow << 1;
        }

//        return ((n & (n-1))==0 && n>0);
    }

    public static void main(String[] args) {
        int n = 1073741825;
        System.out.println(new Solution().isPowerOfTwo(n));
    }
}
