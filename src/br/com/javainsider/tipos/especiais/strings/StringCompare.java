package br.com.javainsider.tipos.especiais.strings;

public class StringCompare {
    public static void main(String[] args) {

        String s1 = "bed";
        String s2 = "chair";
        String s3 = "pet";
        String s4 = "chair";

        int r = s1.compareTo(s2);
        System.out.println(r);

        int r1 = s3.compareTo(s2);
        System.out.println(r1);

        int r2 = s2.compareTo(s4);
        System.out.println(r2);
    }
}
