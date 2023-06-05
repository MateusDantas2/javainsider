package br.com.javainsider.java.essencial.textos.numeros.numeros.randomicos;

public class ExDice {
    public static void main(String[] args) {

        Dice dice = new Dice();

        System.out.println(dice.roll());
        System.out.println(dice.roll());
        System.out.println(dice.roll());
    }
}
