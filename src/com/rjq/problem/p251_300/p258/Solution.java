package com.rjq.problem.p251_300.p258;

public class Solution {
    public int addDigits(int num) {
        int n = num;
        while (true) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }

            if (sum < 10) {
                return sum;
            }

            n = sum;
        }
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(new Solution().addDigits(num));
    }
}
