package br.com.javainsider.java.essencial.oo2.polimorfismo;

public class App4 {
    public static void main(String[] args) {
        Pet p = new Dog();

        if (p instanceof Dog d) {
            d.sit();
        }
    }
}
