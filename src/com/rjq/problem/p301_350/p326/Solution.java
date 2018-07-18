package com.rjq.problem.p301_350.p326;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int i = 0;
        double pow = 1;
        while (true) {
            if (n % pow == 0) {
                i++;
            } else {
                return false;
            }

            pow *= 3;
            if (n < pow) {
                return false;
            } else if (n == pow) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
//        int n = 1;
//        int n = 2;
//        int n = 3;
//        int n = 4;
//        int n = 9;
        int n = 45;
        System.out.println(new Solution().isPowerOfThree(n));
    }
}
