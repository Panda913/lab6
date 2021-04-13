package com.company;

public class arithmeticSum2 {
    static long arithmeticSum2(int variantNum, long to) {
        long result = 0;
        for (long i = 1; i <= to; i++) {
            result += variantNum* i;
        }

        return result;
    }
}
