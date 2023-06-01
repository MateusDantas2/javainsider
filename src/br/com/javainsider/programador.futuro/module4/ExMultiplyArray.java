package br.com.javainsider.programador.futuro.module4;

import java.util.Arrays;

public class ExMultiplyArray {
	public static void main(String[] args) {
		
		double[] array = {2.5, 3.5, 5.5};
		int m = 3;
		
		for(int i = 0; i < array.length; i++) {
//			double e = array[i];
//			e = e * m;
//			array[i] = e;
			
			array[i] = array[i] * m;
		}
		System.out.println(Arrays.toString(array));
	}
}
