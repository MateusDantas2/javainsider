package br.com.javainsider.programador.futuro.module1;

public class JurosComposto {
	public static void main(String[] args) {
		
		double pv = 50.000;
		double i = 0.05;
		double n = 48;
		double fv = pv * Math.pow(1 + i, n);

		System.out.println(fv);
	}
}
