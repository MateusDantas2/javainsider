package br.com.javainsider.java.essencial.java.core.operadores;

public class ExTemperature {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double tf = Double.parseDouble(scanner.nextLine());

       double resultTemperature = (tf - 32) / 9 * 5;
        System.out.println("Temperatura em Celsius é: " + resultTemperature);
    }
}
