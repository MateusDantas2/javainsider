package br.com.javainsider.javaessencial.tipos.especiais.strings;

public class StringReplace {
    public static void main(String[] args) {

        String str = "java is the greatest language!";

        String replaceStr = str.replace("language", "programming language");
        System.out.println(replaceStr);
    }
}
