package com.rjq.problem.p401_450.p414;

import java.util.LinkedList;

public class Solution {
    public int thirdMax(int[] nums) {
        LinkedList<Integer> maxList = new LinkedList<Integer>();
        for (int num : nums) {
            addToMaxList(maxList, num);
        }

        return maxList.size() < 3 ? maxList.get(0) : maxList.get(2);
    }

    private void addToMaxList(LinkedList<Integer> list, int val) {
        int index = 0;
        while (index < 3) {
            if (list.size() == index) {
                list.add(val);
                break;
            }
            if (list.get(index) < val) {
                list.add(index, val);
                break;
            } else if (list.get(index) == val) {
                break;
            }

            index++;
        }

        if (list.size() > 3) {
            list.removeLast();
        }
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{3, 2, 1};
        int[] nums = new int[]{1, 2};
//        int[] nums = new int[]{2, 2, 3, 1};
        System.out.println(new Solution().thirdMax(nums));
    }

}
