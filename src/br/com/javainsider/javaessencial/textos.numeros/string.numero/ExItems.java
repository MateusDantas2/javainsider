package br.com.javainsider.javaessencial.textos.numeros.string.numero;

public class ExItems {

    public static void main(String[] args) {

        Item i1 = new Item("Item #1", 550.5, "EUR");
        Item i2 = new Item("Item #2", 5690, "BRL");
        Item i3 = new Item("Item #3", 5.55, "USD");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
