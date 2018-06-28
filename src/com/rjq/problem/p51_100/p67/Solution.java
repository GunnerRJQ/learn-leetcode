package com.rjq.problem.p51_100.p67;

public class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        int i = a.length() - 1, j = b.length() - 1;
        String result = "";
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int val = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + carry;
            if (val > 1) {
                result = val - 2 + result;
                carry = 1;
            } else {
                result = val + result;
                carry = 0;
            }

            i--;
            j--;
        }

        while (i >= 0) {
            int val = Character.getNumericValue(a.charAt(i)) + carry;
            if (val == 2) {
                result = val - 2 + result;
                carry = 1;
            } else {
                result = val + result;
                carry = 0;
            }

            i--;
        }

        return carry == 1 ? 1 + result : result;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(new Solution().addBinary(a, b));
    }
}
