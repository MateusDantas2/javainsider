package br.com.javainsider.java.essencial.oo2.polimorfismo;

public class Calculator {

    private double total;

    public double sumSurfaceArea(Shape shape) {
        total += shape.surfaceArea();
        return total;
    }
}
