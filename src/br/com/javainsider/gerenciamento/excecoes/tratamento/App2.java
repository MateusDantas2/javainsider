package br.com.javainsider.gerenciamento.excecoes.tratamento;

import br.com.javainsider.gerenciamento.excecoes.falhas.InsufficientFundsException;

public class App2 {
    public static void main(String[] args) {

        Account account = new Account("0001");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(-600);
            System.out.println(account);

        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
            System.out.println("Stacktrace: ");
            e.printStackTrace();
        }

        System.out.println("THE END!");
    }
}
