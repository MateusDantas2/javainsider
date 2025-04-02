package br.com.javainsider.javaessencial.lambda.fundamentos.exercicio;

import java.util.Objects;

public class ExRunTrueFalse {
    public static void main(String[] args) {
        run("JAVA",
            s -> System.out.println("My language is: " + s),
            () -> System.out.println("My language is none!")
        );
    }

    private static void run(String s, CodeWhithParam codeIfNotNull, CodeWhithoutParam codeIfNull) {
        if (Objects.nonNull(s)) {
            codeIfNotNull.execute(s);
        } else {
            codeIfNull.execute();
        }
    }

    @FunctionalInterface
    interface CodeWhithParam {
        void execute(String s);
    }

    @FunctionalInterface
    interface CodeWhithoutParam {
        void execute();
    }
}
