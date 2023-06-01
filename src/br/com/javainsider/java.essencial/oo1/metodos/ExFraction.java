package br.com.javainsider.java.essencial.oo1.metodos;

public class ExFraction {
    int numerator;
    int denominator;

    void set(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    ExFraction multiplyFraction(ExFraction fraction) {
        ExFraction result = new ExFraction();
        result.numerator = numerator * fraction.numerator;
        result.denominator = denominator * fraction.denominator;
        return result;
    }

    void show() {
        System.out.println(numerator + " / " + denominator);
    }
}
