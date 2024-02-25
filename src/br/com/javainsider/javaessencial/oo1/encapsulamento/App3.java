package br.com.javainsider.javaessencial.oo1.encapsulamento;

public class App3 {
    public static void main(String[] args) {

        final var account1 = new EncapsulatedAccount("1234");
        final var account2 = new EncapsulatedAccount("1234", 1000);

//        account1 = new EncapsulatedAccount("4321");
//        account1 = account2;

        account1.printBalance();
        account1.deposit(1000);
        account1.printBalance();
        System.out.println();

        account2.printBalance();
        account2.deposit(1000);
        account2.printBalance();
    }
}
