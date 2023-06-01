package br.com.javainsider.java.essencial.oo2.interfacewalk;

import static br.com.javainsider.java.essencial.oo2.interfacewalk.StringManipulator.lower;

public class App2 {

    public static void main(String[] args) {

        StringManipulatorImpl m = new StringManipulatorImpl();
        System.out.println(m.join("coca", "da"));
        System.out.println(m.takeFirst("java", 2));
        System.out.println(m.upper("java"));
        System.out.println(lower("JAVA"));
    }
}
