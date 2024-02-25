package br.com.javainsider.javaessencial.textos.numeros.big.numbers;

public class RoundingApp1 {
    public static void main(String[] args) {

        double d = 10.5;
        long v = Math.round(d);
        System.out.println(v);

        double f = Math.floor(d);
        System.out.println(f);

        long c = (long) Math.ceil(d);
        System.out.println(c);
    }
}
