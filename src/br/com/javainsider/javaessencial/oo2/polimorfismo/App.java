package br.com.javainsider.java.essencial.oo2.polimorfismo;

public class App {
    public static void main(String[] args) {
        Pet dog = new Dog();
        dog.feed();

        Pet cat = new Cat();
        cat.feed();

        feedPet(dog);
        feedPet(cat);
        feedPet(new Fish());
    }

    private static void feedPet(Pet pet) {
        pet.feed();
    }
}
