package br.com.javainsider.future.programmer.module5;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(fat(4));
	}
	
	static int fat(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * fat(n - 1);
	}
}
