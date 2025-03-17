package br.com.javainsider.javaessencial.textos.numeros.expressoes.regulares;

public class ExRemoveElements {
    public static void main(String[] args) {

        String text = "djaid21321sidjas232dasidn213n2";

        System.out.println(text.replaceAll("[0-9]", ""));
        System.out.println(text.replaceAll("\\d", ""));

        System.out.println(text.replaceAll("\\D", ""));
        System.out.println(text.replaceAll("[^0-9]", ""));
    }
}
