package br.com.javainsider.javaessencial.gerenciamento.excecoes.tratamento;

public class App3 {
    public static void main(String[] args) {

        Account account = new Account("0001");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(-600);
            System.out.println(account);

        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("THE END!");
    }
}
