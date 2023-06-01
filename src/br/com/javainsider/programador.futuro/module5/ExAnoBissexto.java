package br.com.javainsider.programador.futuro.module5;

public class ExAnoBissexto {
	public static void main(String[] args) {
		System.out.println("2004 é um ano bissexto? -> " + IsLeepYear(2004));
		System.out.println("2010 é um ano bissexto? -> " + IsLeepYear(2010));
	}
	static boolean IsLeepYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
}