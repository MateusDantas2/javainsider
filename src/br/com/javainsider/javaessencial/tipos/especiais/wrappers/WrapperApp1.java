package br.com.javainsider.javaessencial.tipos.especiais.wrappers;

public class WrapperApp1 {
    public static void main(String[] args) {
        int i = 10;
        Integer x = Integer.valueOf(i);

        int j = x.intValue();

//        Integer y = new Integer(100);

        Double d = Double.valueOf(10.5);

        System.out.println(x);
        System.out.println(d);
    }
}
