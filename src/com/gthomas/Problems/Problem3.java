package com.gthomas.Problems;


import static com.gthomas.Commons.UsefulFunction.menorDivisor;


public class Problem3 {

    public void runSolution() {
        long a = 600851475143L;

        while (menorDivisor(a) != 0) {
            long minDiv = menorDivisor(a);
            a = a / minDiv;
        }
        System.out.println(a);
    }

}
