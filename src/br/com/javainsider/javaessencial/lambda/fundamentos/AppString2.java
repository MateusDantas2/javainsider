package br.com.javainsider.javaessencial.lambda.fundamentos;

public class AppString2 {
    public static void main(String[] args) {
        print(() -> "Hello World!");
        print(() -> "Hello!");

        print(s -> s.toUpperCase(), "abc");
        print(s -> new StringBuilder(s).reverse().toString().toUpperCase(), "abc");
    }

    private static void print(TextProvider textProvider) {
        System.out.println(textProvider.getText());
    }

    private static void print(TextTransformer textTransformer, String text) {
        System.out.println(textTransformer.transform(text));
    }
}
