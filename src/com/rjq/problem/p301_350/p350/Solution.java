package com.rjq.problem.p301_350.p350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums1) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		List<Integer> list = new ArrayList<>();
		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				list.add(num);
				map.put(num, map.get(num) - 1);
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); ++i) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 2};
		int[] arr = new Solution().intersect(nums1, nums2);
		System.out.println(Arrays.toString(arr));
	}
}
