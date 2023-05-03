package br.com.javainsider.future.programmer.module6;

import java.util.Scanner;

public class ExOperations {
	public static void main(String[] args) {
		
		System.out.print("Número 1: ");
		double n1 = Double.parseDouble(read());
		System.out.print("Número 2: ");
		double n2 = Double.parseDouble(read());
		
		System.out.print("Operação: ");
		String operation = read();
		
		if (operation.equals("+")) {
			System.out.println(n1 + n2);
		} else if (operation.equals("-")) {
			System.out.println(n1 - n2);
		} else if (operation.equals("*")) {
			System.out.println(n1 * n2);
		} else if (operation.equals("/")) {
			System.out.println(n1 / n2);
		} else {
			System.out.println("Operação Inválida!");
		}
	}
	
	static String read() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
