package com.rjq.problem.p190;

//Reverse bits of a given 32 bits unsigned integer.
//
//        Example:
//
//        Input: 43261596
//        Output: 964176192
//        Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
//        return 964176192 represented in binary as 00111001011110000010100101000000.
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result += n & 1;
            n = n >>> 1;
            if (i < 31) {
                result = result << 1;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int n = 1;
//        int n = 43261596;
        Solution solution = new Solution();
        int result = solution.reverseBits(n);
        System.out.println(result);
    }
}
