package br.com.javainsider.future.programmer.module3;

public class ExSequenciaFibonacci {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 3; i <= 15; i++) {
			int result = a + b;
			b = a;
			a = result;
			System.out.println(result);
		}
	}
}
