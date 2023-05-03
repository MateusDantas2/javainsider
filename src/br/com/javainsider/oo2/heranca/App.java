package br.com.javainsider.oo2.heranca;

public class App {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.setNumber("0001");
        a1.setOwner("Mateus");
        a1.setBalance(1000);
        a1.print();

        SavingsAccount a2 = new SavingsAccount();
        a2.setNumber("0001");
        a2.setOwner("Cris");
        a2.setRate(1.2);
        a2.setBalance(500);
        a2.print();
    }
}
