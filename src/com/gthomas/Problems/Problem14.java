package com.gthomas.Problems;

import java.math.BigInteger;

public class Problem14 {
    public void runSolution(int number) {
        int longestChain = 0;
        int startingNumber = 0;
        for (int i = number; i > 0; i--) {
            int currentChain = countSequence(i);
            if (currentChain > longestChain) {
                longestChain = currentChain;
                startingNumber = i;
            }
        }
        System.out.println( "Starting chain " + startingNumber);
    }

    private int countSequence(int number) {
        int count = 0;
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger bigInteger = new BigInteger(String.valueOf(number));
        while (!bigInteger.equals(BigInteger.ONE)) {
            count++;
            boolean numberIsEven = bigInteger.mod(two).equals(BigInteger.ZERO);
            if (numberIsEven) {
                bigInteger = bigInteger.divide(two);
            } else { // number is odd
                bigInteger = bigInteger.multiply(three).add(BigInteger.ONE);
            }
        }
        return count;
    }
}
