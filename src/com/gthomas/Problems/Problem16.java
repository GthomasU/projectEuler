package com.gthomas.Problems;

import java.math.BigInteger;

public class Problem16 {
    public void runSolution() {
        BigInteger two = new BigInteger("2");
        BigInteger result = two.pow(1000);
        int sum = 0;
        String numberAsString = result.toString();
        char[] numberAsCharArray = numberAsString.toCharArray();
        for (char digit :
                numberAsCharArray) {
            int number = Character.getNumericValue(digit);
            sum += number;
        }
        System.out.println("Answer is " + sum);
    }
}
