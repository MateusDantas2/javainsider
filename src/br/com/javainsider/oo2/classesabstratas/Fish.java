package br.com.javainsider.oo2.classesabstratas;

public class Fish extends WaterPet {
    @Override
    public void sleep(int time) {
        System.out.println("O peixe está dormindo.");
    }
}
