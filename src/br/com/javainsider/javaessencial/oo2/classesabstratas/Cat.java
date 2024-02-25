package br.com.javainsider.javaessencial.oo2.classesabstratas;

public class Cat extends EarthPet {

    @Override
    public void toTalk() {
        System.out.println("Miau");
    }

    @Override
    public void sleep(int time) {
        System.out.println("O gato está dormindo.");
    }
}
