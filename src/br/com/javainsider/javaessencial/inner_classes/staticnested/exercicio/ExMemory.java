package br.com.javainsider.javaessencial.inner_classes.staticnested.exercicio;

public class ExMemory {
    public static void main(String[] args) {
        Memory m = new Memory();
        Memory.Stats stats = m.stats();
        System.out.println(stats);
    }
}