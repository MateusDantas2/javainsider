package br.com.javainsider.javaessencial.oo2.heranca;

public class SavingsAccount extends Account {
    private double rate;

//    public SavingsAccount(){
//        super("0001");
//    }

    public SavingsAccount(){}

    public SavingsAccount(String number){
        super(number);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance * rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("Rate: " + rate);
    }
}
