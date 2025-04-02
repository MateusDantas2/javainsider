package br.com.javainsider.javaessencial.lambda.fundamentos;

@FunctionalInterface
public interface PersonCreator {
    Person create(String name);
}
