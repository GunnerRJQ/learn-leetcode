package com.rjq.problem.p151_200.p189;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//        Example 1:
//
//        Input: [1,2,3,4,5,6,7] and k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
//        Example 2:
//
//        Input: [-1,-100,3,99] and k = 2
//        Output: [3,99,-1,-100]
//        Explanation:
//        rotate 1 steps to the right: [99,-1,-100,3]
//        rotate 2 steps to the right: [3,99,-1,-100]

import java.util.Arrays;

public class Solution {

//    public void rotate(int[] nums, int k) {
//        int len = nums.length;
//        if (len == 0 || k == 0) {
//            return;
//        }
//
//        k = k % len;
//
//        int[] tmp = new int[k];
//        int index = 0;
//        for (int i = len - k; i < len; ++i) {
//            tmp[index++] = nums[i];
//        }
//
//        for (int i = len - k - 1; i >= 0; --i) {
//            nums[i + k] = nums[i];
//        }
//        for (int i = 0; i < k; ++i) {
//            nums[i] = tmp[i];
//        }
//    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len == 0 || k == 0) {
            return;
        }

        k = k % len;

        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;

//        int[] nums = new int[]{-1, -100, 3, 99};
//        int k = 2;
        Solution solution = new Solution();
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
