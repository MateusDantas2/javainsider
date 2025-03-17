package br.com.javainsider.javaessencial.gerenciamento.excecoes.falhas;

public class VehicleEx {
    public static void main(String[] args) {

        Vehicle v = new Vehicle(30);
        System.out.println(v.accelerate());
        System.out.println(v.accelerate());
        System.out.println(v.accelerate());
    }
}
