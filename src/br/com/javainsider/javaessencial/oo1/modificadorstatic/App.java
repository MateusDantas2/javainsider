package br.com.javainsider.javaessencial.oo1.modificadorstatic;

public class App {
    public static void main(String[] args) {

        var a1 = new IdGeneratedAccount("Mateus");
        System.out.println(a1.getAccountNumber());

        var a2 = new IdGeneratedAccount("Crisley");
        System.out.println(a2.getAccountNumber());

        var a3 = new IdGeneratedAccount("Jailton");
        System.out.println(a3.getAccountNumber());

        int id = IdGeneratedAccount.getCurrentId();
        System.out.println("000" + id);
    }
}
