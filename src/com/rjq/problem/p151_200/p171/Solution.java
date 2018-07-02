package com.rjq.problem.p151_200.p171;

public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = s.length() - 1;i >= 0; --i) {
            int pow = s.length() - i - 1;
            result += ((int) s.charAt(i) - 64) * Math.pow(26, pow);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(new Solution().titleToNumber(s));
    }
}
