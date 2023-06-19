package br.com.javainsider.java.essencial.tipos.especiais.wrappers;

public class WrapperApp5 {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = 10;
        Integer i4 = 10;
        Integer i5 = 1000;
        Integer i6 = 1000;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i3 == i4);
        System.out.println(i5 == i6);

        System.out.println("--------------*-------------");

        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        System.out.println(i3.equals(i4));
        System.out.println(i5.equals(i6));

        System.out.println("--------------*-------------");

        System.out.println(i1.intValue() == i2.intValue());
        System.out.println(i1.intValue() == i3.intValue());
        System.out.println(i3.intValue() == i4.intValue());
        System.out.println(i5.intValue() == i6.intValue());
    }
}
