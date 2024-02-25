package br.com.javainsider.javaessencial.oo2.polimorfismo;

public class SequenceGenerator implements Generator {

    private int current;
    @Override
    public int next() {
        return ++current;
    }
}
