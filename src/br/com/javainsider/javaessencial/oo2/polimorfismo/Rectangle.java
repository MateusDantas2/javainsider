package br.com.javainsider.java.essencial.oo2.polimorfismo;

public class Rectangle implements Shape {

    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return base * height;
    }
}
