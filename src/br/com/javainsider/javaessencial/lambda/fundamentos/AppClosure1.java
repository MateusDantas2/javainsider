package br.com.javainsider.javaessencial.lambda.fundamentos;

public class AppClosure1 {
    public static void main(String[] args) {
        int mult = 2;

        Operation sum = (n1 ,n2) -> (n1 + n2) * mult;
        Operation sum2 = Integer::sum;


        System.out.println(sum.calculate(5, 2));
        System.out.println(sum.calculate(5, 2));
    }
}
