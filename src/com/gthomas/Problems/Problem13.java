package com.gthomas.Problems;


import java.math.BigInteger;

import static com.gthomas.Commons.UsefulFunction.getNumbersForProblem13;

public class Problem13 {
    public void runSolution() {
        String[] numbersAsString = getNumbersForProblem13();
        BigInteger sum = new BigInteger("0");
        for (String numberAsString :
                numbersAsString) {
            BigInteger numberAsInteger = new BigInteger(numberAsString);
            sum = sum.add(numberAsInteger);
        }
        System.out.println(sum.toString());
    }
}
