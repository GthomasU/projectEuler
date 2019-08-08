package com.gthomas.Problems;

import static com.gthomas.Commons.UsefulFunction.createStringForProblem8;

public class Problem8 {

    public void runSolution() {
        String number = createStringForProblem8();
        long multiplo = 0;
        long mayor = 0;
        for (int i = 0; i <= 987; i++) {
            multiplo = Long.valueOf(String.valueOf(number.charAt(i)));
            for (int j = 1; j < 13; j++) {
                long numero = Long.valueOf(String.valueOf(number.charAt(i + j)));
                multiplo = multiplo * numero;
            }
            if (multiplo > mayor) {
                mayor = multiplo;
            }
        }
        System.out.println(mayor);
    }

}
