package com.rjq.problem.p251_300.p290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || pattern.length() == 0) {
            return false;
        }
        String[] strArr = str.split(" ");
        if (pattern.length() != strArr.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<Character, String>();
        Map<String, Character> mirroMap = new HashMap<String, Character>();

        for (int i = 0; i < strArr.length; ++i) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (mirroMap.containsKey(strArr[i])) {
                    return false;
                }

                map.put(pattern.charAt(i), strArr[i]);
                mirroMap.put(strArr[i], pattern.charAt(i));
            } else {
                String val = map.get(pattern.charAt(i));
                if (!val.equals(strArr[i])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String pattern = "abba";
//        String str = "dog cat cat dog";

        String pattern = "abba";
        String str = "dog dog dog dog";

//        String pattern = "abba";
//        String str = "dog dog dog fish";

        System.out.println(new Solution().wordPattern(pattern, str));

    }
}
