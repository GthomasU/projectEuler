package com.gthomas.Problems;

import static com.gthomas.Commons.UsefulFunction.createStringForProblem11;

public class Problem11 {

    public void problema11() {
        String numbers = createStringForProblem11();
        int num[][] = new int[20][20];
        int indiceCadena = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                char a = numbers.charAt(indiceCadena);
                indiceCadena++;
                char b = numbers.charAt(indiceCadena);
                indiceCadena += 2;
                int val = Integer.valueOf(String.valueOf(new char[]{a, b}));
                num[i][j] = val;
            }
        }

        int mayor = 0;
        int horizontal = 0;
        int vertical = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j + 3 <= 19) {
                    horizontal = num[i][j] * num[i][j + 1] * num[i][j + 2] * num[i][j + 3];
                }
                if (i + 3 <= 19) {
                    vertical = num[i][j] * num[i + 1][j] * num[i + 2][j] * num[i + 3][j];
                }
                if (i + 3 <= 19 && j + 3 <= 19) {
                    diagonal1 = num[i][j] * num[i + 1][j + 1] * num[i + 2][j + 2] * num[i + 3][j + 3];
                }
                if (i + 3 <= 19 && j - 3 >= 0) {
                    diagonal2 = num[i][j] * num[i + 1][j - 1] * num[i + 2][j - 2] * num[i + 3][j - 3];
                }
                if (horizontal > mayor) {
                    mayor = horizontal;
                }
                if (vertical > mayor) {
                    mayor = vertical;
                }
                if (diagonal1 > mayor) {
                    mayor = diagonal1;
                }
                if (diagonal2 > mayor) {
                    mayor = diagonal2;
                }
            }
        }
        System.out.println(mayor);
    }



}
