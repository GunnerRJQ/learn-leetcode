package com.rjq.problem.p301_350.p344;

public class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            char tmp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = tmp;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(new Solution().reverseString(s));
    }
}
