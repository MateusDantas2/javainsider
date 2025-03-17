package br.com.javainsider.javaessencial.java.core.repeticoes;

import java.util.Scanner;

public class ExTabuada {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Tabuada do...");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
