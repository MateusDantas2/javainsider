package br.com.javainsider.javaessencial.java.core.decisoes;

public class VariableScope {
    public static void main(String[] args) {

        int a = 10;

        if (a == 10) {
            int b = 15;
        } else {
            int b = 20;
        }

//        System.out.println(b);
    }
}
