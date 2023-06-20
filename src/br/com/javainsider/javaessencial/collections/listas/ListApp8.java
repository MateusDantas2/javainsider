package br.com.javainsider.javaessencial.collections.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApp8 {
    public static void main(String[] args) {

        var people = new ArrayList<>(List.of(
            new Person("Maria", 45),
            new Person("Paulo", 36),
            new Person("Pedro", 40),
            new Person("Ana", 30)
        ));

//        Collections.sort(people);
        people.sort(new PersonComparator());

        for (var p: people) {
            System.out.format("==> %s\n", p);
        }
    }
}
