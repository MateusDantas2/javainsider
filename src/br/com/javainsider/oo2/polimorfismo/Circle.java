package br.com.javainsider.oo2.polimorfismo;

import static java.lang.Math.PI;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return PI * radius * radius;
    }
}
