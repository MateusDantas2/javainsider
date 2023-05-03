package br.com.javainsider.java.core.operadores;

public class ExAverage {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digte a primeira nota: ");
        double n1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digte a segunda nota: ");
        double n2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digte a terceira nota: ");
        double n3 = Double.parseDouble(scanner.nextLine());

        double avg = ((n1 + n2 + n3) / 3);
        System.out.println("A média é: " + avg);
    }
}
