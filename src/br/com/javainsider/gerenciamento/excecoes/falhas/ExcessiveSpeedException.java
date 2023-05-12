package br.com.javainsider.gerenciamento.excecoes.falhas;

public class ExcessiveSpeedException extends RuntimeException {

    public ExcessiveSpeedException(String message) {
        super(message);
    }
}
