package com.rjq.problem.p263;

public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        int n = num;
        while (true) {
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }
            if (n % 3 == 0) {
                n /= 3;
                continue;
            }
            if (n % 5 == 0) {
                n /= 5;
                continue;
            }

            return n == 1;
        }
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println(new Solution().isUgly(num));
    }
}
