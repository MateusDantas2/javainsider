package br.com.javainsider.java.essencial.oo2.heranca;

public class ExAnimal {
    public static void main(String[] args) {

        System.out.println("--> DOG");
        Dog snoop = new Dog();
        snoop.setColor("Marrom");
        snoop.toWalk();
        snoop.toTalk();

        System.out.println("--> CAT");
        Cat luna = new Cat();
        luna.setColor("Branco");
        luna.toWalk();
        luna.toTalk();
        luna.toTalk();

        System.out.println("--> CAT");
        Cat lili = new Cat();
        lili.setColor("Cinza");
        lili.toWalk();
        lili.toTalk();

        System.out.println("--> FISH");
        Fish nemo = new Fish();
        nemo.setColor("Laranja");
        nemo.toSwim();
    }
}
