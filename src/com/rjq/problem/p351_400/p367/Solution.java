package com.rjq.problem.p351_400.p367;

public class Solution {
	public boolean isPerfectSquare(int num) {
		if (num == 1) {
			return true;
		}

		int i = 1;
		int half = num / 2;
		while (i <= half) {
			if (i * i == num) {
				return true;
			}
			i++;
		}

		return false;
	}

	public static void main(String[] args) {

		int num = 16;
		System.out.println(new Solution().isPerfectSquare(num));
	}
}
