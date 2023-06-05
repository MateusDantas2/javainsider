package br.com.javainsider.java.essencial.textos.numeros.numeros.randomicos;

import java.util.Random;

public class RandomApp3 {
    public static void main(String[] args) {

        Random random = new Random(1L);

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(0, 101));
//
//            System.out.println(random.nextDouble(5, 11));
//
//            System.out.println(random.nextInt());
//
//            System.out.println(random.nextInt(10));
        }
    }
}
