package com.rjq.problem.p251_300.p268;

public class Solution {
    public int missingNumber(int[] nums) {
        int max = -1;
        int sum = 0;
        boolean zeroExist = false;
        for (int num : nums) {
            if (num == 0) {
                zeroExist = true;
            } else {
                sum += num;
            }

            if (max < num) {
                max = num;
            }
        }

        int predict = max * (max + 1) / 2;
        if (predict != sum) {
            return predict - sum;
        } else if (zeroExist) {
            return max + 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
//        int[] nums = new int[]{8, 6, 4, 2, 3, 5, 7, 0, 1};
//        int[] nums = new int[]{8, 6, 4, 2, 3, 5, 7, 9, 1};
//        int[] nums = new int[]{1};
        int[] nums = new int[]{0};
        System.out.println(new Solution().missingNumber(nums));
    }
}
