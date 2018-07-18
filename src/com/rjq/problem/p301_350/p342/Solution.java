package com.rjq.problem.p301_350.p342;

public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }

        int i = 0;
        double pow = 1;
        while (true) {
            if (num % pow == 0) {
                i++;
            } else {
                return false;
            }

            pow *= 4;
            if (num < pow) {
                return false;
            } else if (num == pow) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
//        int num = 16;
        int num = 8;
        System.out.println(new Solution().isPowerOfFour(num));

    }
}
