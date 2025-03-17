package br.com.javainsider.javaessencial.gerenciamento.excecoes.tratamento;

import br.com.javainsider.javaessencial.gerenciamento.excecoes.falhas.Account3;
import br.com.javainsider.javaessencial.gerenciamento.excecoes.falhas.InsufficientFundsException;

public class App {
    public static void main(String[] args) {

        Account3 account = new Account3("0001");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);

        } catch (InsufficientFundsException e) {
//            e.printStackTrace();
            System.out.println("Ops... pouco dinheiro na conta!");
        }
    }
}
