package com.rjq.problem.p251_300.p292;

public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(new Solution().canWinNim(n));
    }
}
