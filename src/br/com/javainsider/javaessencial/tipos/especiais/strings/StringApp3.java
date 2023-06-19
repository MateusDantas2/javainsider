package br.com.javainsider.java.essencial.tipos.especiais.strings;

public class StringApp3 {
    public static void main(String[] args) {

//        String s = "";
//        for (char c = 'A'; c <= 'Z'; c++) {
//            s += c;
//        }
//        System.out.println(s);

        StringBuilder s = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            s.append(c);
        }
        System.out.println(s);
    }
}
