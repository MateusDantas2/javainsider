package br.com.javainsider.java.essencial.gerenciamento.excecoes.tratamento;

import br.com.javainsider.java.essencial.gerenciamento.excecoes.falhas.InsufficientFundsException;

public class App4 {
    public static void main(String[] args) {

        Account account = new Account("0001");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);

        } catch (InsufficientFundsException e) {
            System.out.println("Não há saldo.");

        } finally {
            System.out.println("THE END");
        }
    }
}
