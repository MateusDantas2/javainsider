package br.com.javainsider.programadorfuturo.module2;

public class DaysInMonths {
	public static void main(String[] args) {
		
		int month = 2;
		int year = 1999;
		int numDays;
		
		if (month == 2) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				numDays = 29;
				System.out.print("O ano é bissexto. ");
			} else {
				numDays = 28;
				System.out.print("O ano não é bissexto. ");
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			numDays = 31;
		} else {
			numDays = 30;
		}
		
		System.out.println("O mês " + month + " possuí " + numDays + " dias!");
	}
}
