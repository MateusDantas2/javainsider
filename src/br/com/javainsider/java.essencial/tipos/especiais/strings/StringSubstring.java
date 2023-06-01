package br.com.javainsider.java.essencial.tipos.especiais.strings;

public class StringSubstring {
    public static void main(String[] args) {

        String str = "java is the greatest language!";

        String substr1 = str.substring(4).trim();
        System.out.println(substr1);

        String substr2 = str.substring(4, str.length() - 1);
        System.out.println(substr2);

        String substr3 = str.substring(11, 20);
        System.out.println(substr3);
    }
}
