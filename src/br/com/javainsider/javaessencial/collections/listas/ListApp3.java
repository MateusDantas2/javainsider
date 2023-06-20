package br.com.javainsider.javaessencial.collections.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApp3 {
    public static void main(String[] args) {
        var list = List.of("A", "B", "C", "D", "E");
        var list2 = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        //Enhanced-for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        //For normal
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println();

        //Iterator
        Iterator<String> iter = list2.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.equals("C")) {
                iter.remove();
            }
        }

        System.out.println(list2);
    }
}
