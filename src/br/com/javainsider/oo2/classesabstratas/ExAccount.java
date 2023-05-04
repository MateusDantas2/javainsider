package br.com.javainsider.oo2.classesabstratas;

public class ExAccount {
    public static void main(String[] args) {

        System.out.println("----------CONTA CORRENTE----------");

        CheckingAccount cc = new CheckingAccount(0.01);
        System.out.println(cc.getBalance());
        cc.updateBalance();
        cc.updateBalance();
        System.out.println(cc.getBalance());

        System.out.println("----------CONTA POUPANÇA----------");

        SavingsAccount cp = new SavingsAccount(100);
        System.out.println(cp.getBalance());
        cp.updateBalance();
        cp.updateBalance();
        System.out.println(cp.getBalance());
    }
}
