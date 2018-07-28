package com.rjq.problem.p301_350.p349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums1) {
			set.add(num);
		}

		Set<Integer> set2 = new HashSet<>();
		for (int num : nums2) {
			if (set.contains(num)) {
				set2.add(num);
			}
		}

		int[] result = new int[set2.size()];
		int i = 0;
		for (Integer num : set2) {
			result[i++] = num;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 2};
		int[] arr = new Solution().intersection(nums1, nums2);
		System.out.println(Arrays.toString(arr));
	}
}
