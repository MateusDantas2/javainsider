package br.com.javainsider.programadorfuturo.module6;

public class StringEquality {
	public static void main(String[] args) {
		
		String a = new String("dog");
		String b = new String("dog");
		
		if (a.equals(b)) {
			System.out.println("Strings equal!");
		} else {
			System.out.println("Strings different!");
		}
	}
}
