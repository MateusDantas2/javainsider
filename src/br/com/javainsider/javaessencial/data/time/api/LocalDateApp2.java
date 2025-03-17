package br.com.javainsider.javaessencial.data.time.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateApp2 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1999, 1, 1);
        LocalDate date2 = date1.withYear(2000).withMonth(5);
        LocalDate date3 = date2.plusYears(2);
        LocalDate date4 = date3.minusDays(5);
        LocalDate date5 = date4.minus(5, ChronoUnit.DAYS);

        String formatDate = date5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(formatDate);
    }
}
