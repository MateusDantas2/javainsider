package br.com.javainsider.programador.futuro.module3;

public class ExNumeroPrimo {
	public static void main(String[] args) {
		
		int n = 15;
		boolean isPrime = true;
		
		if (n == 0 || n == 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		System.out.println(n + " é primo? --> " + isPrime);
	}
}
