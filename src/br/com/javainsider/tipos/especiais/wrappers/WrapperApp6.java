package br.com.javainsider.tipos.especiais.wrappers;

public class WrapperApp6 {
    public static void main(String[] args) {

        Person p1 = new Person(null, 115.0);
        System.out.println(p1);

        System.out.println(p1.getAge() + 10);
    }
}
