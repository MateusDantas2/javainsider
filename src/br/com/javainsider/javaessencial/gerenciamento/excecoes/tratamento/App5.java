package br.com.javainsider.javaessencial.gerenciamento.excecoes.tratamento;

public class App5 {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        try {
            accountService.createAndWithdraw("0001", 1200);

        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
