package br.com.javainsider.java.essencial.java.core.repeticoes;

import java.util.Scanner;

public class ExAverageWithInput {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int nota = 1;
        double sum = 0;

        while (true) {
            System.out.print("Digite a nota " + nota + ": ");

            String line = scanner.nextLine();

            if (line.isBlank()) {
                nota--;
                break;
            } else {
                sum += Double.parseDouble(line);
                nota++;
            }
        }

        double avg = sum / nota;
        System.out.println(nota + " Nota(s) fornecida(s)!");
        System.out.println("A média das notas é: " + avg);
    }
}
