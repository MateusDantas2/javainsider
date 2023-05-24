package br.com.javainsider.tipos.especiais.wrappers;

public class WrapperApp4 {
    public static void main(String[] args) {

        // Autoboxing
        Integer i = 10;
        i++;
        System.out.println(i);

        //No Autoboxing
        Integer j = Integer.valueOf(10);
        int t = j.intValue();
        t++;
        j = Integer.valueOf(t);
        System.out.println(j);
    }
}
