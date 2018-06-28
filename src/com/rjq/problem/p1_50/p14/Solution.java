package com.rjq.problem.p1_50.p14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        if (len == 1) {
            return strs[0];
        }

        int index = 0;
        int str0Len = strs[0].length();
        while (true) {
            if (index == str0Len) {
                return strs[0].substring(0, index);
            }

            char tmp = strs[0].charAt(index);
            for (int i = 1; i < len; i++) {
                int striLen = strs[i].length();
                if (index == striLen) {
                    return strs[0].substring(0, index);
                }

                if (tmp != strs[i].charAt(index)) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }
    }

    public static void main(String[] args) {
//        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs = new String[]{"dog", "racecar", "car"};
        System.out.println(new Solution().longestCommonPrefix(strs));

    }
}
