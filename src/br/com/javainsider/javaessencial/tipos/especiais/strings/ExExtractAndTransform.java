package br.com.javainsider.java.essencial.tipos.especiais.strings;

public class ExExtractAndTransform {
    public static void main(String[] args) {
        String converted = uppercase("java is cool!", "cool");
        System.out.println(converted);
    }

    private static String uppercase(String s, String piece) {

        int pos = s.indexOf(piece);
        if (pos < 0) {
            return s;
        }

        String value = s.substring(pos, pos + piece.length());
        String transformed = value.toUpperCase();

        return s.substring(0, pos) + transformed + s.substring(pos + piece.length());
    }
}
