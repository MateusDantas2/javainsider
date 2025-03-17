package br.com.javainsider.javaessencial.gerenciamento.excecoes.tratamento;

import br.com.javainsider.javaessencial.gerenciamento.excecoes.falhas.InsufficientFundsException;

public class AccountService {

    public void createAndWithdraw(String accountNumber, double amount) throws ServiceException {

        Account account = new Account(accountNumber);
        account.deposit(1000);

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            throw new ServiceException("Erro durante o saque.", e);
        }
    }
}
