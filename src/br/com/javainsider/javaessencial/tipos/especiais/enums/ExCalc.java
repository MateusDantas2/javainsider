package br.com.javainsider.java.essencial.tipos.especiais.enums;

import static br.com.javainsider.java.essencial.tipos.especiais.enums.ExCalc.Operation.*;

public class ExCalc {

    public interface Calculator {
        double calculate(double n1, double n2);
    }

    public enum Operation implements Calculator {
        SUM('+') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 + n2;
            }
        },
        SUBTRACT('-') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 - n2;
            }
        },
        MULTIPLY('*') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 * n2;
            }
        },
        DIVIDE('/') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 / n2;
            }
        };

        private final char symbol;

        Operation(char symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return String.valueOf(symbol);
        }
    }

    public static void main(String[] args) {
        System.out.println(SUM.calculate(5, 5));
        System.out.println(SUBTRACT.calculate(5, 5));
        System.out.println(MULTIPLY.calculate(5, 5));
        System.out.println(DIVIDE.calculate(5, 5));
    }
}
