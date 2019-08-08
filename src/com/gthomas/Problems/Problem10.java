package com.gthomas.Problems;

import static com.gthomas.Commons.UsefulFunction.serPrimo;

public class Problem10 {

    public void runSolution() {
        long sum = 0;
        for (int i = 2000000; i > 1; i--) {
            if (serPrimo(i)) {
                sum += i;
            }
        }
        System.out.println(sum);

    }

}
