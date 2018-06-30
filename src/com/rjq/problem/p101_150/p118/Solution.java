package com.rjq.problem.p101_150.p118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int j = 1; j <= i; ++j) {
                int leftTop = (j - 1) >= 0 ? result.get(i - 1).get(j - 1) : 0;
                int rightTop = j < i ? result.get(i - 1).get(j) : 0;
                row.add(leftTop + rightTop);
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));

    }
}
