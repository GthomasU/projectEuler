package com.gthomas.Problems;

public class Problem5 {

    public void runSolution() {
        int multiplo = 20;
        boolean encontrado = false;
        while (!encontrado) {
            int cont = 0;
            for (int i = 1; i <= 20; i++) {
                if (multiplo % i != 0) {
                    multiplo++;
                    break;
                }
                cont++;
            }
            if (cont == 20) {
                encontrado = true;
                System.out.println(multiplo);
            }
        }
    }

}
