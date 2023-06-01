package br.com.javainsider.java.essencial.java.core.decisoes;

public class ExIfElse {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        System.out.print("Insira um valor para X assumir: ");
        int x = Integer.parseInt(scanner.nextLine());

        if (x % 2 == 0) {
            x +=5;
        } else {
            x *= 2;
        }

        System.out.println("X = " + x);
    }
}
