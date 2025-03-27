package br.com.javainsider.javaessencial.data.time.api.exercicio;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ExSum {
    public static void main(String[] args) {
        System.out.println(calculateExpirationTime(5));
    }

    private static long calculateExpirationTime(int hours) {
        return Instant.now().plus(hours, ChronoUnit.HOURS).getEpochSecond();
    }
}
