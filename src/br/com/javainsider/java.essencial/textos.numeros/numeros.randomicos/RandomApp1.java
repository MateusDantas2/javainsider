package br.com.javainsider.java.essencial.textos.numeros.numeros.randomicos;

public class RandomApp1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            double d = Math.random() * 10;
            System.out.println(d);
        }
    }
}
