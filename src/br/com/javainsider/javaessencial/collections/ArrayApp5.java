package br.com.javainsider.javaessencial.collections;

public class ArrayApp5 {
    public static void main(String[] args) {
        int sum = sum(new int[] { 5, 6, 3, 10 });
        System.out.println(sum);

        int sum2 = sum2("Soma dos números é: ", 5, 6, 3, 10);
        System.out.println(sum2);
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    private static int sum2(String prefix, int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.print(prefix);
        return sum;
    }
}
