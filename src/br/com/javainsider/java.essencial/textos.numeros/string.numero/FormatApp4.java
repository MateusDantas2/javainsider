package br.com.javainsider.java.essencial.textos.numeros.string.numero;

import java.text.NumberFormat;
import java.util.Currency;

public class FormatApp4 {
    public static void main(String[] args) {

        double n = 3879456.21;

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        nf.setGroupingUsed(false);
        nf.setMinimumFractionDigits(4);
        nf.setMaximumFractionDigits(4);
        nf.setCurrency(Currency.getInstance("EUR"));

        System.out.println(nf.format(n));
    }
}
