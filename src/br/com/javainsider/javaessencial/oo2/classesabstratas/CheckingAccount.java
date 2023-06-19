package br.com.javainsider.java.essencial.oo2.classesabstratas;

public class CheckingAccount extends Account {
    private double rate;

    public CheckingAccount(double rate) {
        super(100);
        this.rate = rate;
    }

    @Override
    double rate() {
        return rate;
    }
}
