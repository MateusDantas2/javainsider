package br.com.javainsider.java.essencial.oo1.packages;

import br.com.javainsider.java.essencial.oo1.classesobjetos.Account;
import br.com.javainsider.java.essencial.oo1.encapsulamento.EncapsulatedAccount;
import br.com.javainsider.java.essencial.oo1.modificadorstatic.IdGeneratedAccount;

public class App {
    public static void main(String[] args) {

        //Fully Qualified Name
//        br.com.javainsider.oo1.metodos.Account a = new br.com.javainsider.oo1.metodos.Account();
        Account a = new Account();
        EncapsulatedAccount d = new EncapsulatedAccount("1234");
        IdGeneratedAccount c = new IdGeneratedAccount("4321");
    }
}
