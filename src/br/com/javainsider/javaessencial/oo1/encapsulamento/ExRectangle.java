package br.com.javainsider.javaessencial.oo1.encapsulamento;

public class ExRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(8, 2);
        System.out.println(r1.square());

        Rectangle r2 = new Rectangle(8);
        System.out.println(r2.square());
    }
}
