package com.gthomas.Problems;

public class Problem2 {

    public void runSolution() {
        int num1 = 1;
        int num2 = 1;
        int sum = 0;
        long sumPares = 0;
        while (num1 + num2 < 4000000) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            if (sum % 2 == 0) {
                sumPares += sum;
            }
        }
        System.out.println("Suma Pares: " + sumPares);
    }

}
