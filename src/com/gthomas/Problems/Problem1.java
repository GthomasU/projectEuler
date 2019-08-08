package com.gthomas.Problems;

import java.util.ArrayList;

public class Problem1 {

    public int runSolution(int limite) {
        int result = 0;
        int multiplo = 1;
        ArrayList<Integer> sumandos = new ArrayList();
        while (result < limite) {
            sumandos.add(result);
            result = 3 * multiplo;
            multiplo++;
        }
        multiplo = 1;
        result = 0;
        while (result < limite) {
            if (!(sumandos.contains(result))) {
                sumandos.add(result);
            }
            result = 5 * multiplo;
            multiplo++;
        }
        int sumaTotal = 0;
        for (int i = 0; i < sumandos.size(); i++) {
            sumaTotal += sumandos.get(i);
        }
        return sumaTotal;
    }

}
