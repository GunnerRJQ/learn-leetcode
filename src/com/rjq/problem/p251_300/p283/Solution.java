package com.rjq.problem.p251_300.p283;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int i = -1;
        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] == 0) {
                i = i < 0 ? j : i;
            } else if(i >= 0){
                nums[i++] = nums[j];
                nums[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
