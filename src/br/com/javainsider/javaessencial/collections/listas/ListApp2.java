package br.com.javainsider.javaessencial.collections.listas;

import java.util.ArrayList;
import java.util.List;

public class ListApp2 {
    public static void main(String[] args) {
        List.of();
        var list = List.of("A", "B", "C", "D");
//        var list = new ArrayList<>(List.of("A", "B", "C", "D"));
//        list.add("E");
//        list.remove("D");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
