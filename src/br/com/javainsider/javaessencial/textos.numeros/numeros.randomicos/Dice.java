package br.com.javainsider.java.essencial.textos.numeros.numeros.randomicos;

import java.util.Random;

public class Dice {

    private Random random = new Random();

    public Numbers roll() {
        return new Numbers(nextNumber(), nextNumber());
    }

    private int nextNumber() {
        return random.nextInt(1, 7);
    }
}
