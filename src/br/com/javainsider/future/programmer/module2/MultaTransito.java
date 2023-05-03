package br.com.javainsider.future.programmer.module2;

public class MultaTransito {
	public static void main(String[] args) {
		
		int velocidade = 101;
		double multa;
		
		if (velocidade <= 80) {
			multa = 0;
		} else if (velocidade > 80 && velocidade <= 100) {
			multa = 67;
		} else {
			multa = 70 + (velocidade - 100) * 10;
		}
		
		System.out.println("O valor da multa é: R$ " + multa);
	}
}
