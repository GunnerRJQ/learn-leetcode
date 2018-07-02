package com.rjq.problem.p201_250.p205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a) != b)
                    return false;
            }
            else if (!map.containsValue(b))
                map.put(a, b);
            else
                return false;

        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "ab";
//        String t = "aa";
        String s = "ab";
        String t = "ca";

        System.out.println(new Solution().isIsomorphic(s, t));
    }
}
