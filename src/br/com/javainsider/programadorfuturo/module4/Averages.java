package br.com.javainsider.programador.futuro.module4;

public class Averages {
	public static void main(String[] args) {
		
		double[] grades = new double[4];
		grades[0] = 8.5;
		grades[1] = 7.0;
		grades[2] = 7.5;
		grades[3] = 6.0;
		
		double sum = 0;
		
		for (double grade : grades) {
			sum = sum + grade;
		}
		
		double avg = sum / grades.length;
		
		System.out.println("Média: " + avg);
	}
}
