package br.com.javainsider.javaessencial.lambda.fundamentos;

public class AppClosure3 {
    public static void main(String[] args) {
        NumberProvider number = new NumberProvider();

        number.setN(1);
        var n1 = number.provide();

        number.setN(10);
        var n2 = number.provide();

        number.setN(20);
        var n3 = number.provide();

        System.out.println(n1.get());
        System.out.println(n2.get());
        System.out.println(n3.get());
    }
}
