package br.com.javainsider.java.essencial.java.core.repeticoes;

public class InnerLoops {
    public static void main(String[] args) {
//Labels
        outer:
        for (int i = 1; i <= 10; i++) {
            inner:
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break outer;
                }
                System.out.println(i + j);
            }
        }
        System.out.println("FIM!");
    }
}
