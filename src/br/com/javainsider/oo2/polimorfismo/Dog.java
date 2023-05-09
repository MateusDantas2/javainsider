package br.com.javainsider.oo2.polimorfismo;

public class Dog extends Pet {

    @Override
    public void feed() {
        System.out.println("Cachorro comendo!");
    }

    public void sit() {
        System.out.println("Cachoro sentando!");
    }
}
