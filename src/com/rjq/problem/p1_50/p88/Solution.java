package com.rjq.problem.p1_50.p88;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        for (int i = m + n - 1; i >= 0; --i) {
            int val1 = index1 >= 0 ? nums1[index1] : Integer.MIN_VALUE;
            int val2 = index2 >= 0 ? nums2[index2] : Integer.MIN_VALUE;
            if (val1 >= val2) {
                nums1[i] = val1;
                index1--;
            } else {
                nums1[i] = val2;
                index2--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        new Solution().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }
}
