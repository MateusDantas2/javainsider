package br.com.javainsider.java.essencial.gerenciamento.excecoes.falhas;

public class InsufficientFundsException extends Exception {

    private final double currentBalance;

    public InsufficientFundsException(double currentBalance) {
        super("Não há fundos suficientes para sacar!");
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
