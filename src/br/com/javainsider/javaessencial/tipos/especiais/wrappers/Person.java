package br.com.javainsider.java.essencial.tipos.especiais.wrappers;

public class Person {

    private final Integer age;
    private final Double weight;

    public Person(Integer age, Double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
