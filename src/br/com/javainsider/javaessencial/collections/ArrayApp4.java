package br.com.javainsider.javaessencial.collections;

import java.util.Arrays;

public class ArrayApp4 {
    public static void main(String[] args) {

        int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19 };

        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.format("=> %s\n", primeNumbers[i]);
        }

        for (int n: primeNumbers) {
            System.out.format("=> %s\n", n);
        }
    }
}
