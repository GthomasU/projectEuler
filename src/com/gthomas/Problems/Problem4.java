package com.gthomas.Problems;

import static com.gthomas.Commons.UsefulFunction.serPalindromo;

public class Problem4 {

    public void runSolution() {
        int mayor = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = i; j > 100; j--) {
                if (serPalindromo(j * i)) {
                    if (j * i > mayor) {
                        mayor = j * i;
                    }
                }
            }
        }
        System.out.println(mayor);
    }

}
