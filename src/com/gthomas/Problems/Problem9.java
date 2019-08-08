package com.gthomas.Problems;

public class Problem9 {

    public void runSolution() {
        for (int c = 997; c >= 335; c--) {
            int num = 1000 - c;
            for (int b = num - 1; b > 0; b--) {
                int a = num - b;
                if (c > b && b > a) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        System.out.println(b * c * a);
                    }
                }
            }
        }
    }


}
