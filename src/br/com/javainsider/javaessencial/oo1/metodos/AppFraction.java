package br.com.javainsider.javaessencial.oo1.metodos;

public class AppFraction {
    public static void main(String[] args) {

        ExFraction f1 = new ExFraction();
        f1.set(2, 4);
        f1.show();

        ExFraction f2 = new ExFraction();
        f2.set(3, 6);
        f2.show();

       ExFraction f3 = f1.multiplyFraction(f2);

        f3.show();
    }
}
