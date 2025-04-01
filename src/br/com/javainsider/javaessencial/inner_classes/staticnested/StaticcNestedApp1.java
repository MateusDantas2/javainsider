package br.com.javainsider.javaessencial.inner_classes.staticnested;

public class StaticcNestedApp1 {
    public static void main(String[] args) {
        Operation op = new Operation(5, 7);
        int result = op.sum();
        op.sum();

        System.out.println("Soma: " + result);

        Operation.Counter counter = op.getCounter();

        System.out.println("Contador: " + counter.getValue());
    }
}
