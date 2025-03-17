package br.com.javainsider.javaessencial.tipos.especiais.strings;

public class StringIndexOf {
    public static void main(String[] args) {

        String str = "java is the greatest language!";
        String str2 = "java is the greatest language! the";

        int pos = str.indexOf("the");
        System.out.println(pos);

        int pos2 = str2.indexOf("the", 10);
        System.out.println(pos2);

        int pos3 = str.lastIndexOf("a");
        System.out.println(pos3);
    }
}
