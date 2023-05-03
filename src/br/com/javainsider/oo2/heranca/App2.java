package br.com.javainsider.oo2.heranca;

public class App2 {
    public static void main(String[] args) {

        SavingsAccount a1 = new SavingsAccount();
        SavingsAccount b1 = new SavingsAccount("0001");
        System.out.println(b1.getNumber());
    }
}
