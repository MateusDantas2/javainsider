package br.com.javainsider.java.essencial.oo1.encapsulamento;

public class Rectangle {

    private final double side1;
    private final double side2;
    private final double square;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        square = side1 * side2;
    }

    public Rectangle(double side1) {
        this(side1, side1);
    }

    public double square() {
       return square;
    }
}
