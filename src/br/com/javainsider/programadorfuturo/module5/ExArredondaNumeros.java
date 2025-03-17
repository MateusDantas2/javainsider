package br.com.javainsider.programadorfuturo.module5;

import java.util.Arrays;

public class ExArredondaNumeros {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arredondar(new double[] {5.5, 8.9, 2.2, 10.0})));
	}
	
	static int[] arredondar(double[] numbers) {
		int [] arredondaNumeros = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			arredondaNumeros[i] = (int) numbers[i];
		}
		
		return arredondaNumeros;
	}
}
