package br.com.javainsider.javaessencial.tipos.especiais.enums;

public class EnumApp1 {

    private enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {

        Month firstMonth = Month.JANUARY;
        Month noMonth = null;
    }
}
