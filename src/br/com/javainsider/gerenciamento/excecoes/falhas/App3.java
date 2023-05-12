package br.com.javainsider.gerenciamento.excecoes.falhas;

public class App3 {
    public static void main(String[] args) throws InsufficientFundsException {

        Account3 a = new Account3("0001");
        a.deposit(500);
        System.out.println(a);

        a.withdraw(600);
        System.out.println(a);

        System.out.println("Sucesso!");
    }
}
