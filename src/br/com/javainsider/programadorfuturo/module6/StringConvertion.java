package br.com.javainsider.programadorfuturo.module6;

import java.util.Scanner;

public class StringConvertion {
	public static void main(String[] args) {
		
		System.out.print("Número: ");
		String numberStr = read();
//		int number = numberStr * numberStr;
		int number = Integer.parseInt(numberStr);
		System.out.println("Número ao quadrado: " + (number * number));
		System.out.print("Número 2: ");
		String numberStr2 = read();
		double number2 = Double.parseDouble(numberStr2);
		System.out.println("Número ao quadrado: " + (number2 * number2));
	}
	
	static String read() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
