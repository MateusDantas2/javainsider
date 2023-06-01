package br.com.javainsider.java.essencial.tipos.especiais.enums;

import static br.com.javainsider.java.essencial.tipos.especiais.enums.Car.Brand.AUDI;
import static br.com.javainsider.java.essencial.tipos.especiais.enums.Car.Brand.BMW;

public class EnumApp5 {
    public static void main(String[] args) {

//        Car c = new Car(Car.Brand.BMW);
        Car c = new Car(BMW);
        System.out.println(c.getBrand());

        Car c2 = new Car(AUDI);
        System.out.println(c2.getBrand());
    }
}
