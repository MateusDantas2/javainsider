package br.com.javainsider.java.essencial.textos.numeros.numeros.randomicos;

public class RandomApp2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int d = random(0, 15);
            System.out.println(d);
        }
    }

    private static int random(int from, int to) {
        return (int) (Math.random() * (to - from + 1)) + from;
    }
}
