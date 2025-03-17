package br.com.javainsider.programadorfuturo.module4;

public class ForInteration {
	public static void main(String[] args) {
		
		double [] grades = new double[4];
		
		grades[0] = 8.5;
		grades[1] = 7.0;
		grades[2] = 7.5;
		grades[3] = 6.0;
		
		for (int i = 0; i < grades.length; i ++) {
			double g = grades[i];
			System.out.println("-> " + g);
		}
		
		System.out.println();
		
		for (int i = grades.length - 1; i >= 0; i --) {
			double g = grades[i];
			System.out.println("-> " + g);
		}
	}
}
