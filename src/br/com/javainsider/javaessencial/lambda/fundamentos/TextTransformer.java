package br.com.javainsider.javaessencial.lambda.fundamentos;

@FunctionalInterface
public interface TextTransformer {
    String transform(String text);
}
