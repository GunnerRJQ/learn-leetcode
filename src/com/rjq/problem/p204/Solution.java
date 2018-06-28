package com.rjq.problem.p204;

import java.util.HashMap;

public class Solution {
    private static final HashMap<Integer, Boolean> prime = new HashMap<Integer, Boolean>();
    static {
        prime.put(2, true);
        prime.put(3, true);
        prime.put(5, true);
    }

    public int countPrimes(int n) {
        int result = 0;
        for (int i = 2; i < n; ++i) {
            //TODO rjq 2018/6/27
//            Boolean isPrime = prime.get(i);
//            if (isPrime == null) {
//                for (int j = 2; j * i < n; ++j) {
//                    if (i % j == 0) {
//                        prime.put(i, false);
//
//                    }
//                }
//                prime.put(num, true);
//                return true;
//            } else {
//                return isPrime;
//            }
//
//
//            if (checkPrime(i)) {
//                result++;
//            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 999983;
        System.out.println(new Solution().countPrimes(n));
    }
}
