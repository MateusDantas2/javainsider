package br.com.javainsider.oo2.polimorfismo;

public class App3 {
    public static void main(String[] args) {

        Pet p = new Dog();
        p.feed();

//        Fish f = (Fish) p;
//        f.feed();

        if (p instanceof Dog) {
            Dog d = (Dog) p;
            d.sit();
        } else {
            System.out.println("O tipo não é um cachorro!");
        }
    }
}
