package com.rjq.problem.p301_350.p345;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private static final Set<Character> vowels = new HashSet<Character>();

    static {
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
    }

    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (vowels.contains(chars[i]) && vowels.contains(chars[j])) {
                char tmp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = tmp;
            } else if (vowels.contains(chars[i])) {
                j--;
            } else {
                i++;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(new Solution().reverseVowels(s).toCharArray());
    }
}
