package br.com.javainsider.javaessencial.gerenciamento.excecoes.falhas;

public class ExcessiveSpeedException extends RuntimeException {

    public ExcessiveSpeedException(String message) {
        super(message);
    }
}
