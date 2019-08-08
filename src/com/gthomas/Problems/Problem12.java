package com.gthomas.Problems;

import java.util.ArrayList;

import static com.gthomas.Commons.UsefulFunction.serPrimo;

public class Problem12 {

    /**
     * 76576500
     */
    public void runSolution() {
        int div = 2;
        long gen = 72;
        long num = 0;
        boolean encontrado = false;
        boolean descompuesto = false;
        ArrayList<Integer> arbol = new ArrayList<Integer>();
        while (!encontrado) {
            num = ((gen + 1) * (gen)) / 2;
            while (!descompuesto) {
                if (num % div == 0) {
                    num = num / div;
                    System.out.println(div);
                    if (serPrimo(num)) {
                        descompuesto = true;
                        encontrado = true;
                    }
                } else {
                    div++;
                }

            }
            gen++;
        }
    }
}
