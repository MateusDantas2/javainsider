package br.com.javainsider.javaessencial.collections.listas;

import java.util.*;

public class ExListRandom {
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(generate(10));
        System.out.println(generate(5));
        System.out.println(generate(2));
    }

    private static List<Integer> generate(int number) {
        var numbers = new ArrayList<Integer>(number);

        for (int i = 0; i < number; i++) {
            numbers.add(random.nextInt(0, 101));
        }

        numbers.sort(Comparator.naturalOrder());
        return Collections.unmodifiableList(numbers);
    }
}
