package br.com.javainsider.programador.futuro.module1;

public class ExEquacaoSegundoGrau {
	public static void main(String[] args) {
		
		int a = 5;
		int b = -3;
		int c = -2;
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (- b + Math.sqrt(delta)) / (2 * a);
		double x2 = (- b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("O valor de delta é: " + delta);
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
	}
}