package br.com.javainsider.programador.futuro.module2;

public class JogandoDados {
	public static void main(String[] args) {
		
		int dado1 = (int) (Math.random() * 6) + 1;
		int dado2 = (int) (Math.random() * 6) + 1;
		
		System.out.println("Valor do 1º dado: " + dado1);
		System.out.println("Valor do 2º dado: " + dado2);
		
		int soma = dado1 + dado2;
		
		if (dado1 == dado2) {
			soma = soma * 2;
		}
		
		System.out.println("Casas = " + soma);
	}
}
