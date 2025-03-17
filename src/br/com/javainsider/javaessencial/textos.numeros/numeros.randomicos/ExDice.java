package br.com.javainsider.javaessencial.textos.numeros.numeros.randomicos;

public class ExDice {
    public static void main(String[] args) {

        Dice dice = new Dice();

        System.out.println(dice.roll());
        System.out.println(dice.roll());
        System.out.println(dice.roll());
    }
}
