package br.com.javainsider.javaessencial.java.core.decisoes;

public class EXDayOfWeek {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite um número para escolher o dia da semana: ");
        int day = Integer.parseInt(scanner.nextLine());

       String dow = switch (day) {
           case 1 -> "DOMINGO";
           case 2 -> "SEGUNDA";
           case 3 -> "TERÇA";
           case 4 -> "QUARTA";
           case 5 -> "QUINTA";
           case 6 -> "SEXTA";
           case 7 -> "SÁBADO";
           default -> "DIA INVÁLIDO!";
        };

        System.out.println("O dia da semana é: " + dow);
    }
}
