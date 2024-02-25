package br.com.javainsider.javaessencial.oo2.classesabstratas;

public abstract class Pet {
    private String color;
    private int amountEaten;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmountEaten() {
        return amountEaten;
    }

    public void feed(int amount) {
        amountEaten += amount;
    }

    public abstract void sleep(int time);
}
