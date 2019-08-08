package com.gthomas.Problems;

import static com.gthomas.Commons.UsefulFunction.serPrimo;

public class Problem7 {

    public void runSolution() {
        int cont = 0;
        int num = 1;
        while (cont < 10001) {
            num++;
            if (serPrimo(num)) {
                cont++;
            }

        }
        System.out.println(num);
    }

}
