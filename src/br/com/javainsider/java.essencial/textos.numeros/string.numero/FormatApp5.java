package br.com.javainsider.java.essencial.textos.numeros.string.numero;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp5 {
    public static void main(String[] args) {

        double n = 3456.21;

        Locale locale = new Locale("en", "US");

        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(locale);

        String formatted1 = nf1.format(n);
        String formatted2 = nf2.format(n);

        PrintWriter out = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
        out.println(formatted1);
        System.out.println(formatted2);
    }
}
