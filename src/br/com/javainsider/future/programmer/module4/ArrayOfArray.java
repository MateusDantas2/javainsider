package br.com.javainsider.future.programmer.module4;

public class ArrayOfArray {
	public static void main(String[] args) {
		
		// Cria o array vazio
//		String[][] array = new String[2][3];
		
		// Cria o array inicializando os valroes
		String[][] array = {
			{"A", "B", "C"},
			{"D", "E", "F"},
			{"G", "H", "I"}
		};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
