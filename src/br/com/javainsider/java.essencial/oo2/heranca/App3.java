package br.com.javainsider.java.essencial.oo2.heranca;

public class App3 {
    public static void main(String[] args) {

        Account a = new Account();
        a.setOwner("Mateus");
        a.setNumber("0001");
        a.setBalance(1000);
        System.out.println(a.toString());
    }
}
