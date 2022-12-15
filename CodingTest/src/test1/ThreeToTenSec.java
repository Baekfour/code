package test1;

import java.util.Arrays;

public class ThreeToTenSec {

    public int solution(int q, int[] a) {
        // Modulo constant
        final int MOD = 998244353;

        // Count the number of times each element of a appears
        int[] elementCounts = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            elementCounts[a[i]]++;
        }

        // Calculate the number of queries needed to make a all zeros
        // by multiplying the number of occurrences of each element in a
        long queries = 1;
        for (int i = 0; i < a.length; i++) {
            if (elementCounts[i] > 0) {
                queries = queries * elementCounts[i] % MOD;
            }
        }

        // Return the result modulo the modulo constant
        return (int) (queries * q % MOD);
    }

}

