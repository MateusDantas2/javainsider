package br.com.javainsider.javaessencial.inner_classes.anonymous;

public class AnonymousInnerClassApp2 {

    public static void main(String[] args) {
        Food food = new Food();
        food.eat();

        Food food2 = new Food() {
            @Override
            public void eat() {
                System.out.println("Eating fish!");
            }
        };
        food2.eat();
    }
}