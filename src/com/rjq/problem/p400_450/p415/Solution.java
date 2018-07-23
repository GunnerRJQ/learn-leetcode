package com.rjq.problem.p400_450.p415;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; --i, --j) {
            int val1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int val2 = j < 0 ? 0 : num2.charAt(j) - '0';
            int val = val1 + val2 + carry;
            if (val > 9) {
                result.append(val - 10);
                carry = 1;
            } else {
                result.append(val);
                carry = 0;
            }
        }

        if (carry == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "99";
        String num2 = "1";
        System.out.println(new Solution().addStrings(num1, num2));
    }
}
