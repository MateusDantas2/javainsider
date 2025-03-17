package br.com.javainsider.javaessencial.java.core.repeticoes;

public class ExEvenSum {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = i % 2 == 0 ? sum + i : sum;
        }

        System.out.println("A soma dos números são: " + sum);
    }
}
