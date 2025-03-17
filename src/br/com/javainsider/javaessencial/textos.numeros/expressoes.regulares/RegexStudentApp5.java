package br.com.javainsider.javaessencial.textos.numeros.expressoes.regulares;

import java.util.Arrays;
import java.util.Scanner;

public class RegexStudentApp5 {
    public static void main(String[] args) {
        String text = "a-b-c-d";
        String text2 = "a1b2c3d";

        String[] tokens = text.split("-");
        String[] tokens2 = text2.split("\\d");

        System.out.println(Arrays.toString(tokens));
        System.out.println(Arrays.toString(tokens2));

        //Usando o Scanner com quebra.
        Scanner scanner = new Scanner(text2);
        scanner.useDelimiter("\\d");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

//        Scanner com dados convertidos para inteiro
        Scanner scanner2 = new Scanner("1,2,3,4");
        scanner2.useDelimiter(",");
        while (scanner2.hasNextInt()) {
            int e = scanner2.nextInt();
            System.out.println(e);
        }

        String alunoRecebido = "Mateus; mateusdantas.dev@gmail.com; 15000";
        String[] textoSeparado = alunoRecebido.split("; | ;\\s");
        System.out.println(Arrays.toString(textoSeparado));

        Student student = new Student();
        student.setName(textoSeparado[0]);
        student.setEmail(textoSeparado[1]);
        student.setPontos(Integer.parseInt(textoSeparado[2]));

        System.out.println("O nome do aluno é: " + student.getName() + " - " +
            "seu e-mail é: " + student.getEmail() + " - " + "seus pontos são: "+ student.getPontos());
    }
}
