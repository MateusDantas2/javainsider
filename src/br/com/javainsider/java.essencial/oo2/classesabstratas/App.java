package br.com.javainsider.java.essencial.oo2.classesabstratas;

public class App {
    public static void main(String[] args) {

        Dog p1 = new Dog();
        p1.feed(10);
        p1.feed(5);
        System.out.println(p1.getAmountEaten());

        Cat p2 = new Cat();
        p2.feed(5);
        p2.feed(9);
        System.out.println(p2.getAmountEaten());

        /* Não posso criar instâncias de classes abstratas
        Pet p3 = new Pet();
        p3.feed(10);
        System.out.println(p3.getAmountEaten());
         */
    }
}
