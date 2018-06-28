package com.rjq.problem.p1_50.p4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //TODO rjq 2018/6/28 未调通
        int m = nums1.length;
        int n = nums2.length;

        int median;
        if ((m + n) % 2 == 0) {
            median = (m + n) / 2;
        } else {
            median = (m + n) / 2 + 1;
        }

        int index = 0, i = 0, j = 0;
        double result = 0;

        while (index < median && i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result = nums1[i++];
            } else {
                result = nums2[j++];
            }
            index++;
        }

        int nextVal = 0;
        if (index < median) {
            if (i < m) {
                result = nums1[i + median - index - 1];
                nextVal = nums1[i + median - index];
            }

            if (j < n) {
                result = nums2[j + median - index - 1];
                nextVal = nums2[j + median - index];
            }
        } else {
            if (i < m && j < n) {
                nextVal = Math.min(nums1[i], nums2[j]);
            }
            if (i < m) {
                nextVal = nums1[i];
            }
            if (j < n) {
                nextVal = nums2[j];
            }
        }


        if ((m + n) % 2 == 0) {
            result = (result + nextVal) / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};

        System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
    }
}
