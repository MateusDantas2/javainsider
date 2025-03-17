package br.com.javainsider.programadorfuturo.module6;

import java.util.Scanner;

public class KeyboardInput {
	public static void main(String[] args) {
		System.out.println("Você digitou: " + read());
	}
	
	static String read() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
