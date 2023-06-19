package br.com.javainsider.java.essencial.gerenciamento.excecoes.tratamento;

import br.com.javainsider.java.essencial.gerenciamento.excecoes.falhas.InsufficientFundsException;


public class App1 {
    public static void main(String[] args) {

        Account account = new Account("0001");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);

        } catch (InsufficientFundsException e) {
            System.out.println("Ops... pouco dinheiro na conta. Só existe R$" + e.getCurrentBalance());

        } catch (IllegalArgumentException e) {
            System.out.println("O valor não pode ser negativo.");
        }

        System.out.println("THE END!");
    }
}
