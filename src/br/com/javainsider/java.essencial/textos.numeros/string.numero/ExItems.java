package br.com.javainsider.java.essencial.textos.numeros.string.numero;

public class ExItems {

    public static void main(String[] args) {

        Item i1 = new Item("Item #1", 550.5, "EUR");
        Item i2 = new Item("Item #1", 5690, "BRL");
        Item i3 = new Item("Item #1", 5.55, "USD");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
