package br.com.javainsider.javaessencial.oo2.classesabstratas;

public class Dog extends EarthPet {

    @Override
    public void toTalk() {
        System.out.println("Au-Au");
    }

    @Override
    public void sleep(int time) {
        System.out.println("O cachorro está dormindo.");
    }
}
