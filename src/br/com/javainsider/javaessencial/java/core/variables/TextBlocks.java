package br.com.javainsider.java.essencial.java.core.variables;

public class TextBlocks {

    public static void main(String[] args) {
        System.out.println("Olá,\n  tudo\n    bem");

        String s = """
                Olá,
                  tudo
                    bem
              """;

        System.out.println(s);
    }
}
