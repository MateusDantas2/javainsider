package br.com.javainsider.javaessencial.java.core.debuggdoc;

/**
 * Classe do meu programa.
 *
 * @author Mateus Dantas
 * @version 1.0
 * @since 1.0
 */
@Deprecated(since = "v2.0", forRemoval = false)
public class Javadoc {

    /**
     * Método main.
     * @param args Parâmetros de linha de comando.
     */
    public static void main(String[] args) {

    }

    /**
     * Este é um método
     * @param x O booleano.
     */
    private static void m1(int x) {
        m1(10);
    }

    /**
     * Este é outro método
     * @param n1 Número 1.
     * @param n2 Número 2.
     * @return Por euquanto, true.
     */
    private static boolean m2(double n1, double n2) {
        return true;
    }
}
