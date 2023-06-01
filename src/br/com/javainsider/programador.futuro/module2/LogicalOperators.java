package br.com.javainsider.programador.futuro.module2;

public class LogicalOperators {
	public static void main(String[] args) {
		
		int idade = 20;
		String categoria;
		
		if (idade > 0 && idade <= 12) {
			categoria = "Criança!";
		} else if (idade > 12 && idade <= 18) {
			categoria = "Adolescente!";
		} else if (idade > 18) {
			categoria = "Adulto!";
		} else {
			categoria = "DESCONHECIDA!";
		}
		
		System.out.println("Categoria para " + idade + " anos: " + categoria);
	}
}
