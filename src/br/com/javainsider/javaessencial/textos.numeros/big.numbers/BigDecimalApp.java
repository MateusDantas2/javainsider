package br.com.javainsider.java.essencial.textos.numeros.big.numbers;

import java.math.BigDecimal;

public class BigDecimalApp {
    public static void main(String[] args) {

        BigDecimal big = new BigDecimal("1851651265.10");
        big = big.multiply(BigDecimal.TEN);

        System.out.println(big);

        System.out.println(big.doubleValue());
    }
}
