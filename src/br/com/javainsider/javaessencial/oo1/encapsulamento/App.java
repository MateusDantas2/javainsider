package br.com.javainsider.javaessencial.oo1.encapsulamento;

public class App {
    public static void main(String[] args) {

        var a = new EncapsulatedAccount();
        a.deposit(1000);
        a.withdraw(200);

        a.printBalance();

        System.out.println(a.getAccountNumber());

//        a.setAccountOwner("Mateus");
        System.out.println(a.getAccountOwner());
    }
}
