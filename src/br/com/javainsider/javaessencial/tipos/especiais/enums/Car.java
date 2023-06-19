package br.com.javainsider.java.essencial.tipos.especiais.enums;

public class Car {

    public enum Brand {
        BMW, AUDI, VW
    }

   final private Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }
}
