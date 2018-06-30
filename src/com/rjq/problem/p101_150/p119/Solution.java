package com.rjq.problem.p101_150.p119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>(rowIndex + 1);
        list.add(1);

        for (int i = 1; i <= rowIndex; ++i) {
            list.set(0, 1);
            int tmpLeftTop = 1;
            for (int j = 1; j <= i; ++j) {
                Integer preRight = j < i ? list.get(j) : 0;
                int sum = tmpLeftTop + preRight;
                tmpLeftTop = preRight;
                if (list.size() < j + 1) {
                    list.add(sum);
                } else {
                    list.set(j, sum);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getRow(5));
    }
}
