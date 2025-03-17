package br.com.javainsider.programadorfuturo.module1;

public class ExTemperatura {
	public static void main(String[] args) {
		double tf = 96.8;
		double tc = (tf - 32) / 9 * 5;
		
		System.out.println("A temperatura em Celsius é: " + tc);
	}
}
