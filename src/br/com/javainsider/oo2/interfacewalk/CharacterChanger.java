package br.com.javainsider.oo2.interfacewalk;

public interface CharacterChanger {

    default String upper(String s) {
        return getChar() + s.substring(1).toUpperCase();
    }

    private char getChar() {
        return '*';
    }
}
