package br.com.javainsider.java.essencial.gerenciamento.excecoes.falhas;

public class App2 {
    public static void main(String[] args) {

        Account2 a = new Account2("0001");
        a.deposit(500);
        System.out.println(a);

        int rc = a.withdraw(200);

        if (rc == -2) {
            System.out.println("ERROR: not enough funds!");
        } else if (rc == -1) {
            System.out.println("ERROR: negative amount");
        } else if (rc == 1) {
            System.out.println("SUCCESS!");
            System.out.println(a);
        }
    }
}
