package br.com.javainsider.javaessencial.gerenciamento.excecoes.tratamento;

import br.com.javainsider.javaessencial.gerenciamento.excecoes.falhas.InsufficientFundsException;

public class Account {

    private final String number;
    private double balance;

    public Account(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo!");
        }

        if (balance - amount < 0) {
            throw new InsufficientFundsException(balance);
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account3{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
