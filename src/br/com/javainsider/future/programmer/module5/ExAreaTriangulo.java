package br.com.javainsider.future.programmer.module5;

public class ExAreaTriangulo {
	public static void main(String[] args) {
		System.out.println("A área do triângulo é -> " + calcularArea(4, 3));
	}
	
	static double calcularArea(double base, double altura) {
		return(base * altura) / 2;
	}
}
