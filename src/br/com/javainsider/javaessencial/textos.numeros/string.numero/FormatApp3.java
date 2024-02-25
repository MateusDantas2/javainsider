package br.com.javainsider.javaessencial.textos.numeros.string.numero;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp3 {
    public static void main(String[] args) {

        double n = 3456.21;

        Locale locale = new Locale("pt", "BR");
        Locale locale2 = new Locale("en", "US");

        NumberFormat nf = NumberFormat.getInstance(locale2);
        String formatted = nf.format(n);

        System.out.println(formatted);
    }
}
