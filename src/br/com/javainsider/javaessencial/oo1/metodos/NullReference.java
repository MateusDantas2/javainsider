package br.com.javainsider.javaessencial.oo1.metodos;

public class NullReference {
    public static void main(String[] args) {

        Account a = null;

        if (a != null) {
            a.printBalance();
        } else {
            System.out.println("Valor nulo!");
        }
    }
}
