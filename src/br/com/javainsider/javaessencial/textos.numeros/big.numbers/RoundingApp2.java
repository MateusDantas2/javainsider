package br.com.javainsider.javaessencial.textos.numeros.big.numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingApp2 {
    public static void main(String[] args) {

        BigDecimal d = BigDecimal.valueOf(10.43);
        d = d.setScale(1, RoundingMode.UP);
        d = d.setScale(0, RoundingMode.DOWN);
        d = d.setScale(0, RoundingMode.UP);
        System.out.println(d);
    }
}
