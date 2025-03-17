package br.com.javainsider.javaessencial.java.core.decisoes;

public class ExVehicle {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Insira qual é a velocidade permitida: ");
        int allowed = Integer.parseInt(scanner.nextLine());

        System.out.print("Insira qual é a velocidade atual: ");
        int current = Integer.parseInt(scanner.nextLine());
        int amount;
        if (allowed < current) {

            int considered;

            if (allowed < 100) {
                considered = current + 7;
            } else {
                considered = current + (int) (current * 0.1);
            }
            int diff = considered - allowed;
            amount = diff * 10;
        } else {
            amount = 0;
        }

        System.out.println("Valor da multa: " + amount);
    }
}
