package br.com.javainsider.javaessencial.textos.numeros.big.numbers;

import java.math.BigInteger;

public class BigIntegerApp {

    public static void main(String[] args) {
        BigInteger big = new BigInteger("23213213123213213121232132121321");
        big = big.add(BigInteger.TEN);
        big = big.subtract(BigInteger.ONE);
        System.out.println(big.longValue());

        System.out.println(big);

        BigInteger big2 = BigInteger.valueOf(100);
        System.out.println(big2);
        System.out.println(big2.intValue());
    }
}
