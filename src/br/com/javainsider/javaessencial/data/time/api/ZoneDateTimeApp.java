package br.com.javainsider.java.essencial.data.time.api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeApp {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2022, 2, 10, 14, 0, 0);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.systemDefault());
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(zdt1);
        System.out.println(zdt2);
    }
}
