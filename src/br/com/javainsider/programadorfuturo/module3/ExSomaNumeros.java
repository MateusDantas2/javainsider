package br.com.javainsider.programadorfuturo.module3;

public class ExSomaNumeros {
	public static void main(String[] args) {
		
		int n = 10;
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		
		System.out.println("A soma é: " + sum);
	}
}
