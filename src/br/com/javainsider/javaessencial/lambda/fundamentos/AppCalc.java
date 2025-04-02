package br.com.javainsider.javaessencial.lambda.fundamentos;

public class AppCalc {
    public static void main(String[] args) {

        Operation sum = new Operation() {
            @Override
            public int calculate(int n1, int n2) {
                return n1 + n2;
            }
        };

        //Forma 1
        Operation mult = (int n1, int n2) -> {
            return n1 * n2;
        };

        //Forma 2
        Operation div = (n1,n2) -> n1 / n2;

        run(sum);
        run(mult);
        run(div);
        //Forma 3
        run((n1,n2) -> n1 - n2);
    }

    private static void run(Operation operation) {
        int result = operation.calculate(5, 4);
        System.out.println(result);
    }
}
