package br.com.javainsider.javaessencial.oo2.classesabstratas;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double rate() {
        return 0.05;
    }
}
