package br.com.javainsider.java.essencial.oo2.polimorfismo;

/**
 * Modificador sealed permite herança, mas tem que indicar quais as classes que podem receber herança.
 */
public abstract sealed class Vehicle permits Car, Bus {

    public abstract void drive();
}
