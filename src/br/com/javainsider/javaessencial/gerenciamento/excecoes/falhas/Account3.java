package br.com.javainsider.java.essencial.gerenciamento.excecoes.falhas;

public class Account3 {

    private final String number;
    private double balance;

    public Account3(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new RuntimeException("O valor não pode ser negativo!");
        }

//        if (balance - amount < 0) {
//            throw new Exception("Fundos insuficientes!");
//        }
//        this.balance -= amount;

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
